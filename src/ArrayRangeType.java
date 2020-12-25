import org.antlr.symtab.ArrayType;
import org.antlr.symtab.Type;

public class ArrayRangeType extends ArrayType {
    protected final int start;
    protected final int end;

    public ArrayRangeType(Type elemType, int start, int end) {
        super(elemType, Math.abs(end - start));
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return elemType+"[" + start + ", " + end + "]";
    }
}
