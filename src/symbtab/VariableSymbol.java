package symbtab;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.Queue;

public class VariableSymbol extends Scope {
    public enum VariableTag {
        ENTITY, PARAMETER, BODY
    }

    VariableTag variableTag;

    public VariableSymbol(Scope enclosedScope, RuleContext node, String name, Type type, VariableTag variableType) {
        super(enclosedScope, node, name, type);
        enclosedScope.define(name, this);

        this.variableTag = variableType;
    }

    @Override
    protected LinkedList<Scope> find(Queue<TerminalNode> key, LinkedList<Scope> trace) throws Exception {
        //System.out.println(name + " variable scope finding: " + key.peek());
        trace.add(this);
        key.remove();
        if (key.size() == 0) { return trace; }

        //System.out.println(name + " variable scope consumed: " + key);
        return type.getReferencedScope().find(key, trace);
    }

    @Override
    protected LinkedList<Scope> find(String key, LinkedList<Scope> trace) throws Exception {
        //System.out.println("Variable scope finding: " + key);
        trace.add(this);
        return trace;
    }

    public void resolveType() {
        type.attachScope(this);
    }
    public boolean isPrimitive() { return type.getType() != Type.Typetype.USER_DECLARED; }

    public int getStart() { return type.getStart(); }
    public int getEnd() { return type.getEnd(); }
}
