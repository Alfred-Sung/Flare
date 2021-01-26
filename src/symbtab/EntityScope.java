package symbtab;

import Flare.util.FileGenerator;
import exception.FlareException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EntityScope extends Scope {
    private HashMap<String, Integer> attributes = new HashMap<>();
    private HashMap<String, Integer> attributeIndex = new HashMap<>();
    private List<VariableSymbol> components = new LinkedList<>();

    public EntityScope(Scope enclosedScope, ParserRuleContext node, String name) {
        super(enclosedScope, node, name);
        enclosedScope.define(name, this);
    }

    @Override
    protected void define(String name, Scope child) {
        super.define(name, child);

        if (child instanceof VariableSymbol) components.add((VariableSymbol) child);
    }

    @Override
    protected LinkedList<Scope> find(Queue<TerminalNode> key, LinkedList<Scope> trace) throws Exception {
        trace.add(this);
        if (key.size() == 0) { return trace; }

        String front = key.peek().getText();

        if (children.containsKey(front)) {
            //key.remove();
            return children.get(front).find(key, trace);
        } else {
            throw new FlareException("Identifier " + front + " not found", key.peek().getSymbol());
        }
    }

    @Override
    protected LinkedList<Scope> find(String key, LinkedList<Scope> trace) throws Exception {
        trace.add(this);

        if (key.equals(name)) { return trace; }

        //System.out.println("Entity scope finding: " + key);

        if (children.containsKey(key))
            return children.get(key).find(key, trace);
        else
            throw new FlareException("Identifier " + key + " not found", ((ParserRuleContext)node).getStart());
    }

    public boolean addComponent(VariableSymbol component) {
        boolean result = attributes.containsKey(component.getTypeName());

        if (result) {
            int n = attributes.get(component.getTypeName());
            attributeIndex.put(component.getName(), n);
            attributes.replace(component.getTypeName(), n + 1);
        } else {
            attributeIndex.put(component.getName(), 0);
            attributes.put(component.getTypeName(), 1);
        }

        return !result;
    }

    public int getComponentAttribute(String componentName) { return attributes.get(componentName); }
    public int getComponentIndex(String componentName) { return attributeIndex.get(componentName); }
    public List<VariableSymbol> getComponents() { return components; }
}
