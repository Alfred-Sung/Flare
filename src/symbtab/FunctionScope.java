package symbtab;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.Queue;

public class FunctionScope extends Scope {
    Type returnType;

    public FunctionScope(Scope enclosedScope, RuleContext node, String name, Type returnType) {
        super(enclosedScope, node, name);
        this.returnType = returnType;

        //this.returnType.attachScope(this);
        enclosedScope.define(name, this);
    }

    @Override
    protected LinkedList<Scope> find(Queue<TerminalNode> key, LinkedList<Scope> trace) throws Exception {
        trace.add(this);

        //System.out.println("Function scope finding: " + key.peek());
        if (key.size() == 0) { return trace; }

        //key.remove();
        return returnType.getReferencedScope().find(key, trace);
    }

    @Override
    protected LinkedList<Scope> find(String key, LinkedList<Scope> trace) throws Exception {
        trace.add(this);

        //System.out.println("Function scope finding: " + key);
        return trace;
    }

    public void resolveType() {
        returnType.attachScope(this);
    }
    public Type getType() {
        return returnType;
    }
}
