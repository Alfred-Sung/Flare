package symbtab;
public class Type {
    static enum Typetype {
        BOOLEAN, CHAR, BYTE, SHORT, INT, LONG, FLOAT, DOUBLE, STRING, VOID, USER_DECLARED
    }

    int start, end;
    Typetype type;
    String typeName;
    Scope referencedScope;

    public Type(String typeName, int start, int end) {
        this.start = start;
        this.end = end;
        this.typeName = typeName;

        switch (typeName) {
            case "boolean":
                this.type = Typetype.BOOLEAN;
                break;
            case "char":
                this.type = Typetype.CHAR;
                break;
            case "byte":
                this.type = Typetype.BYTE;
                break;
            case "short":
                this.type = Typetype.SHORT;
                break;
            case "int":
                this.type = Typetype.INT;
                break;
            case "long":
                this.type = Typetype.LONG;
                break;
            case "float":
                this.type = Typetype.FLOAT;
                break;
            case "double":
                this.type = Typetype.DOUBLE;
                break;
            case "string":
                this.type = Typetype.STRING;
                break;
            case "void":
                this.type = Typetype.VOID;
                break;
            default:
                this.type = Typetype.USER_DECLARED;
                break;
        }
    }

    public Type(Typetype type, int start, int end) {
        this.start = start;
        this.end = end;
        this.type = type;

        switch (type) {
            case BOOLEAN:
                this.typeName = "boolean";
                break;
            case CHAR:
                this.typeName = "char";
                break;
            case BYTE:
                this.typeName = "byte";
                break;
            case SHORT:
                this.typeName = "short";
                break;
            case INT:
                this.typeName = "int";
                break;
            case LONG:
                this.typeName = "long";
                break;
            case FLOAT:
                this.typeName = "float";
                break;
            case DOUBLE:
                this.typeName = "double";
                break;
            case STRING:
                this.typeName = "string";
                break;
            case VOID:
                this.typeName = "void";
                break;
        }
    }

    public void attachScope(Scope scope) {
        if (this.type == Typetype.USER_DECLARED)
            referencedScope = scope.resolve(typeName);
        else
            referencedScope = scope;
    }

    public Scope getReferencedScope() { return referencedScope; }
}
