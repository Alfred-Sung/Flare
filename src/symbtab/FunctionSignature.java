package symbtab;

import Flare.FlareParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionSignature extends Scope {
    List<Type> signature = new LinkedList<>();

    public FunctionSignature(Scope enclosedScope, RuleContext node, Type returnType) {
        super(enclosedScope, node, "", returnType);
    }

    @Override
    protected LinkedList<Scope> find(Queue<TerminalNode> key, LinkedList<Scope> trace) throws Exception {
        return null;
    }

    @Override
    protected LinkedList<Scope> find(String key, LinkedList<Scope> trace) throws Exception {
        return null;
    }

    public boolean match(List<Type> parameters) {
        if (parameters.size() != signature.size()) return false;

        for (int i = 0; i < signature.size(); i++)
            if (!parameters.get(i).equals(signature.get(i))) return false;

        return true;
    }

    public void setSignature(List<Type> signature) { this.signature = signature; }
    public List<Type> getSignature() { return signature; }

    @Override
    public String toString() { return signature.toString().replace("[", "").replace("]", ""); }
}
