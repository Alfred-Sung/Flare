package symbtab;

import Flare.FlareParser;
import exception.FlareException;
import symbtab.exception.ScopeException;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.Set;

public class Type {
    public enum Typetype {
        BOOLEAN, CHAR, BYTE, SHORT, INT, LONG, FLOAT, DOUBLE, STRING, VOID, USER_DECLARED
    }

    Set<Typetype> numberLiterals = EnumSet.of(Typetype.SHORT, Typetype.INT, Typetype.LONG, Typetype.FLOAT, Typetype.DOUBLE);

    public static String getDefaultValue(Typetype type) {
        switch (type) {
            case BOOLEAN:
                return "false";
            case CHAR:
                return "\' \'";
            case BYTE:
            case LONG:
            case SHORT:
            case INT:
                return "0";
            case FLOAT:
            case DOUBLE:
                return "0.0";
            case STRING:
                return "\"\"";
        }

        return "null";
    }

    public static Type getType(FlareParser.LiteralContext ctx) {
        if (ctx.integerLiteral() != null)
            return new Type(Typetype.INT, 0, 1);
        else if (ctx.floatLiteral() != null)
            return new Type(Typetype.FLOAT, 0, 1);
        else if (ctx.CHAR_LITERAL() != null)
            return new Type(Typetype.CHAR, 0, 1);
        else if (ctx.STRING_LITERAL() != null)
            return new Type(Typetype.STRING, 0, 1);
        else if (ctx.BOOL_LITERAL() != null)
            return new Type(Typetype.BOOLEAN, 0, 1);

        return new Type(Typetype.VOID, 0, 1);
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
    public void attachScope(Scope scope) throws FlareException {
        try {
            // No need to resolve scope if it is primitive
            if (this.type == Typetype.USER_DECLARED)
                referencedScope = scope.resolve(scope.getEntityScope(), typeName, new LinkedList<>()).getLast();
            else
                referencedScope = scope;
        } catch (ScopeException e) {
            throw new FlareException("Variable type " + typeName + " not defined", scope.getNode().start);
        }
    }

    public boolean isPrimitive() { return type != Typetype.USER_DECLARED; }
    public Typetype getType() { return type; }
    public String getName() { return typeName; }
    public String getTranslatedName() { return type == Typetype.STRING ? "std::string" : typeName; }
    public Scope getReferencedScope() {
        return referencedScope;
    }

    public int getStart() { return start; }
    public int getEnd() { return end; }
    public int getLength() { return Math.abs(end- start); }

    @Override
    public boolean equals(Object obj) {
        Type other = (Type)obj;

        boolean typeCheck = (this.type == other.type && this.typeName.equals(other.getName()));
        boolean lengthCheck = (this.getLength() == other.getLength() || other.getLength() == 1);

        if (typeCheck && lengthCheck) return true;
        return (numberLiterals.contains(this.type) && numberLiterals.contains(other.type) && lengthCheck);
    }

    @Override
    public String toString() {
        return typeName;
    }
}
