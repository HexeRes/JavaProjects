package HumanParts;

public class Body {

    private int width;
    private int height;

    public Body(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Body{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
