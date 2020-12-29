package symbtab;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Queue;

public class VariableSymbol extends Scope {
    Type type;

    public VariableSymbol(Scope enclosedScope, RuleContext node, String name, Type type) {
        super(enclosedScope, node, name);
        this.type = type;
        enclosedScope.define(name, this);
    }

    @Override
    protected Scope find(Queue<TerminalNode> key) throws Exception {
        if (key.size() == 0)
            return this;
        key.remove();
        return type.getReferencedScope().find(key);
    }

    @Override
    protected Scope find(String key) throws Exception {
        //System.out.println("Variable scope finding: " + key);
        return this;
    }

    public void resolveType() { type.attachScope(this); }
    public Scope getTypeScope() { return type.getReferencedScope(); }
}
