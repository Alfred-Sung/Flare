package symbtab;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CodeBlockScope extends Scope {
    List<CodeBlockScope> codeBlockScopes = new LinkedList<>();

    public CodeBlockScope(Scope enclosedScope, RuleContext node, String name) {
        super(enclosedScope, node, name, null);

        //Code blocks don't need to define themselves in their enclosing scope
    }

    public LinkedList<Scope> resolve(Queue<TerminalNode> key, LinkedList<Scope> trace) {
        try {
            //Check if identifier matches children second
            if (children.containsKey(key))
                return children.get(key).find(key, trace);

        } catch (Exception e) {}

        // Continue search up the scope tree
        return enclosedScope.resolve(key, trace);
    }

    public LinkedList<Scope> resolve(String key, LinkedList<Scope> trace) {
        try {
            //Check if identifier matches children second
            if (children.containsKey(key))
                return children.get(key).find(key, trace);

        } catch (Exception e) {}

        // Continue search up the scope tree
        return enclosedScope.resolve(key, trace);
    }

    @Override
    protected LinkedList<Scope> find(Queue<TerminalNode> key, LinkedList<Scope> trace) throws Exception {
        return null;
    }

    @Override
    protected LinkedList<Scope> find(String key, LinkedList<Scope> trace) throws Exception {
        return null;
    }


}
