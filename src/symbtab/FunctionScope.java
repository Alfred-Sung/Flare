package symbtab;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Queue;

public class FunctionScope extends Scope {
    Type returnType;

    public FunctionScope(Scope enclosedScope, RuleContext node, String name, Type returnType) {
        super(enclosedScope, node, name);
        this.returnType = returnType;

        this.returnType.attachScope(this);
        enclosedScope.define(name, this);
    }

    @Override
    protected Scope find(String key) throws Exception {
        System.out.println("Function scope finding: " + key);
        return this;
    }

    @Override
    protected Scope find(Queue<TerminalNode> key) throws Exception {
        System.out.println("Function scope finding: " + key.peek());

        if (key.size() == 0)
            return this;

        return returnType.getReferencedScope().resolve(key);
    }

    public Type getType() { return returnType; }
}
