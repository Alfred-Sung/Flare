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
    private HashMap<VariableSymbol, Integer> componentAttributes = new HashMap<>();
    private HashMap<String, VariableSymbol> currentAttributes = new HashMap<>();

    public EntityScope(Scope enclosedScope, ParserRuleContext node, String name) {
        super(enclosedScope, node, name);
        enclosedScope.define(name, this);
    }

    @Override
    protected LinkedList<Scope> find(Queue<TerminalNode> key, LinkedList<Scope> trace) throws Exception {
        trace.add(this);

        if (key.size() == 0) { return trace; }

        String front = key.peek().getText();
        //System.out.println("Entity scope finding: " + front);

        if (children.containsKey(front)) {
            key.remove();
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
        boolean result = currentAttributes.containsKey(component.getTypeName());

        if (result) {
            Integer attribute = componentAttributes.get(currentAttributes.get(component.getTypeName()));
            currentAttributes.replace(component.getTypeName(), component);
            componentAttributes.put(component, attribute + 1);
        } else {
            currentAttributes.put(component.getTypeName(), component);
            componentAttributes.put(component, 0);
        }

        return result;
    }

    public List<VariableSymbol> getComponents() { return new LinkedList<>(componentAttributes.keySet()); }
}
