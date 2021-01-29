package symbtab;

import java.util.LinkedList;

public class Type {
    public enum Typetype {
        BOOLEAN, CHAR, BYTE, SHORT, INT, LONG, FLOAT, DOUBLE, STRING, VOID, USER_DECLARED
    }

    public static String getDefaultValue(Typetype type) {
        switch (type) {
            case BOOLEAN:
                return "false";
            case CHAR:
                return "";
            case BYTE:
            case SHORT:
            case INT:
                return "0";
            case LONG:
            case FLOAT:
            case DOUBLE:
                return "0.0";
            case STRING:
                return "\"\"";
        }

        return "null";
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

    /**
     * Attach a type to a scope; namely functions and variables
     * @param scope Scope to be attached to
     */
    public void attachScope(Scope scope) {
        // No need to resolve scope if it is primitive
        if (this.type == Typetype.USER_DECLARED)
            referencedScope = scope.resolve(typeName, new LinkedList<Scope>()).getLast();
        else
            referencedScope = scope;
    }

    public boolean isPrimitive() { return type != Typetype.USER_DECLARED; }
    public Typetype getType() { return type; }
    public String getName() { return typeName; }
    public Scope getReferencedScope() {
        return referencedScope;
    }
    public int getStart() { return start; }
    public int getEnd() { return end; }

    public boolean equals(Type obj) {
        return this.type == obj.type && this.typeName.equals(obj.getName());
    }

    @Override
    public String toString() {
        return typeName;
    }
}
