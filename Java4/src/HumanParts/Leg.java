package HumanParts;

public class Leg {
    int length;

    public Leg(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "length=" + length +
                '}';
    }
}
