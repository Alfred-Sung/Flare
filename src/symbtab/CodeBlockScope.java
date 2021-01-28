package symbtab;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CodeBlockScope extends Scope {
    List<CodeBlockScope> codeBlockScopes = new LinkedList<>();

    public CodeBlockScope(Scope enclosedScope, RuleContext node, String name) {
        super(enclosedScope, node, name);


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
