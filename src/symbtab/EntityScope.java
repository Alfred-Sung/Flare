package symbtab;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Queue;

public class EntityScope extends Scope {
    public EntityScope(Scope enclosedScope, RuleContext node, String name) {
        super(enclosedScope, node, name);
        enclosedScope.define(name, this);
    }

    @Override
    protected Scope find(Queue<TerminalNode> key) throws Exception {
        if (key.size() == 0) { return this; }

        String front = key.peek().getText();
        System.out.println("Entity scope finding: " + front);

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

        System.out.println("Entity scope finding: " + key);

        if (children.containsKey(key))
            return children.get(key).find(key);
        else
            throw new Exception("Identifier " + key + " not found");
    }
}
