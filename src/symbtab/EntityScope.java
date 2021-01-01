package symbtab;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EntityScope extends Scope {
    private HashMap<VariableSymbol, Integer> componentAttributes = new HashMap<>();
    private HashMap<String, VariableSymbol> currentAttributes = new HashMap<>();

    public EntityScope(Scope enclosedScope, RuleContext node, String name) {
        super(enclosedScope, node, name);
        enclosedScope.define(name, this);
    }

    @Override
    protected Scope find(Queue<TerminalNode> key) throws Exception {
        if (key.size() == 0) {
            return this;
        }

        String front = key.peek().getText();
        //System.out.println("Entity scope finding: " + front);

        if (children.containsKey(front)) {
            key.remove();
            return children.get(front).find(key);
        } else {
            throw new Exception("Identifier " + front + " not found");
        }
    }

    @Override
    protected Scope find(String key) throws Exception {
        if (key.equals(name)) { return this; }

        //System.out.println("Entity scope finding: " + key);

        if (children.containsKey(key))
            return children.get(key).find(key);
        else
            throw new Exception("Identifier " + key + " not found");
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
