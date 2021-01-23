package symbtab;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.Queue;

public class VariableSymbol extends Scope {
    Type type;

    public VariableSymbol(Scope enclosedScope, RuleContext node, String name, Type type) {
        super(enclosedScope, node, name);
        this.type = type;
        enclosedScope.define(name, this);
    }

    @Override
    protected LinkedList<Scope> find(Queue<TerminalNode> key, LinkedList<Scope> trace) throws Exception {
        //System.out.println(name + " variable scope finding: " + key.peek());
        trace.add(this);

        key.remove();
        //System.out.println(name + " variable scope consumed: " + key);
        if (key.size() == 0) { return trace; }

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

    public Scope getTypeScope() {
        return type.getReferencedScope();
    }
    public String getTypeName() {  return type.getName(); }

    public Type getType() { return type; }
    public int getStart() { return type.getStart(); }
    public int getEnd() { return type.getEnd(); }
}
