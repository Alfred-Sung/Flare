package symbtab;

import exception.FlareException;
import symbtab.exception.InvalidScopeException;
import symbtab.exception.ScopeException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EntityScope extends Scope {
    private HashMap<String, Integer> attributes = new HashMap<>();
    private HashMap<String, Integer> attributeSize = new HashMap<>();
    private HashMap<String, Integer> attributeIndex = new HashMap<>();
    private List<VariableSymbol> components = new LinkedList<>();

    public EntityScope(Scope enclosedScope, RuleContext node, String name, Type type) throws FlareException {
        super(null, enclosedScope, node, name, type, Visibility.PUBLIC);
        this.entityScope = this;
        enclosedScope.define(name, this);
    }

    @Override
    protected void define(String name, Scope child) throws FlareException {
        super.define(name, child);

        if (child instanceof VariableSymbol) components.add((VariableSymbol) child);
    }

    @Override
    protected LinkedList<Scope> find(Scope source, Queue<TerminalNode> key, LinkedList<Scope> trace) throws ScopeException {
        trace.add(this);
        if (key.size() == 0) { return trace; }

        String front = key.peek().getText();

        if (children.containsKey(front)) {
            //key.remove();
            if (children.get(front).visibility == Visibility.PRIVATE)
                if (source == null || this.getName() != source.getName())
                    throw new InvalidScopeException("Scope " + front + " is protected and inaccessible");

            return children.get(front).find(source, key, trace);
        } else {
            throw new ScopeException("Identifier " + front + " not found");
        }
    }

    @Override
    protected LinkedList<Scope> find(Scope source, String key, LinkedList<Scope> trace) throws ScopeException {
        trace.add(this);

        if (key.equals(name)) { return trace; }

        //System.out.println("Entity scope finding: " + key);

        if (children.containsKey(key)) {
            //key.remove();
            if (children.get(key).visibility == Visibility.PRIVATE)
                if (source == null || this.getName() != source.getName())
                    throw new InvalidScopeException("Scope " + key + " is protected and inaccessible");

            return children.get(key).find(source, key, trace);
        } else {
            throw new ScopeException("Identifier " + key + " not found");
        }
    }

    public void addComponent(VariableSymbol component) {
        if (component.getType().getType() != Type.Typetype.USER_DECLARED) {
            attributes.putIfAbsent(component.getTranslatedName(), component.getType().getLength());
            attributeIndex.putIfAbsent(component.getTranslatedName(), 0);
        } else {
            attributes.putIfAbsent(component.getTypeName(), 0);
            attributeIndex.putIfAbsent(component.getTranslatedName(), attributes.get(component.getTypeName()));
            attributes.replace(component.getTypeName(), attributes.get(component.getTypeName()) + component.getType().getLength());
        }

        attributeSize.putIfAbsent(component.getTranslatedName(), component.getType().getLength());
    }

    public int getComponentSize(VariableSymbol component) { return attributeSize.get(component.getTranslatedName()); }
    public int getComponentIndex(VariableSymbol component) { return attributeIndex.get(component.getTranslatedName()); }
    public List<VariableSymbol> getComponents() { return components; }
}
