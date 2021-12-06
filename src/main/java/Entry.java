import java.util.Objects;

public class Entry {

    private float number;
    private Symbol other;
    private String str;
    private Type type;

    public Entry(float value) {
        this.number = value;
    }

    public Entry(Symbol which) {
        this.other = which;
    }

    public Entry(float value, Symbol which) {
        this.number = value;
        this.other = which;
    }

    public Type getType() {
        return this.type;
    }

    public String getString() {
        return this.str;
    }

    public Symbol getSymbol() {
        return this.other;
    }

    public float getValue() {
        return this.number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public void setOther(Symbol other) {
        this.other = other;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setType(Type type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return Float.compare(entry.number, number) == 0 && other == entry.other;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, other);
    }

    @Override
    public String toString() {
        return "Entry{" +
                "number=" + number +
                ", symbol=" + other +
                ", str='" + str + '\'' +
                ", type=" + type +
                '}';
    }
}
