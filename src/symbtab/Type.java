package symbtab;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Type {
    int start, end;
    String typeName;
    Scope referencedScope;

    public Type(String typeName, int start, int end) {
        this.start = start;
        this.end = end;
        this.typeName = typeName;
    }

    public void attachScope(Scope scope) {
        referencedScope = scope.resolve(typeName);
    }

    public Scope getReferencedScope() { return referencedScope; }
}
