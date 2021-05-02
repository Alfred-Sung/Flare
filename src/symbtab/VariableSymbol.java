package symbtab;

import exception.FlareException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbtab.exception.ScopeException;

import java.util.LinkedList;
import java.util.Queue;

public class VariableSymbol extends Scope {
    public enum VariableTag {
        ENTITY, PARAMETER, BODY
    }

    VariableTag variableTag;

    public VariableSymbol(Scope entityScope, Scope enclosedScope, RuleContext node, String name, Type type, VariableTag variableType) throws FlareException {
        super(entityScope, enclosedScope, node, name, type, Visibility.PRIVATE);
        //translatedName = enclosedScope.getName() + "_" + name;
        enclosedScope.define(name, this);

        this.variableTag = variableType;
    }

    @Override
    protected LinkedList<Scope> find(Scope source, Queue<TerminalNode> key, LinkedList<Scope> trace) throws ScopeException {
        //System.out.println(name + " variable scope finding: " + key.peek());
        trace.add(this);
        key.remove();
        if (key.size() == 0) { return trace; }

        //System.out.println(name + " variable scope consumed: " + key);
        return type.getReferencedScope().find(source, key, trace);
    }

    @Override
    protected LinkedList<Scope> find(Scope source, String key, LinkedList<Scope> trace) throws ScopeException {
        //System.out.println("Variable scope finding: " + key);
        trace.add(this);
        return trace;
    }

    public void resolveType() throws FlareException {
        type.attachScope(this);
    }
    public boolean isPrimitive() { return type.getType() != Type.Typetype.USER_DECLARED; }

    public VariableTag getTag() { return variableTag; }
    public int getTypeStart() { return type.getStart(); }
    public int getTypeEnd() { return type.getEnd(); }
}
