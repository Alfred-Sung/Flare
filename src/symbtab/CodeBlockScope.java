package symbtab;

import symbtab.exception.ScopeException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CodeBlockScope extends Scope {
    List<CodeBlockScope> codeBlockScopes = new LinkedList<>();

    public CodeBlockScope(Scope entityScope, Scope enclosedScope, RuleContext node, String name) {
        super(entityScope, enclosedScope, node, name, null, Visibility.PUBLIC);

        //Code blocks don't need to define themselves in their enclosing scope
    }

    public LinkedList<Scope> resolve(Scope source, Queue<TerminalNode> key, LinkedList<Scope> trace) throws ScopeException {
        //Check if identifier matches children second
        if (children.containsKey(key))
            return children.get(key).find(source, key, trace);

        // Continue search up the scope tree
        return enclosedScope.resolve(source, key, trace);
    }

    public LinkedList<Scope> resolve(Scope source, String key, LinkedList<Scope> trace) throws ScopeException {
        //Check if identifier matches children second
        if (children.containsKey(key))
            return children.get(key).find(source, key, trace);

        // Continue search up the scope tree
        return enclosedScope.resolve(source, key, trace);
    }

    @Override
    protected LinkedList<Scope> find(Scope source, Queue<TerminalNode> key, LinkedList<Scope> trace) throws ScopeException {
        return null;
    }

    @Override
    protected LinkedList<Scope> find(Scope source, String key, LinkedList<Scope> trace) throws ScopeException {
        return null;
    }
}
