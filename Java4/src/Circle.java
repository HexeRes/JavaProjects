public class Circle {
    private float radius;
    private int x,y;

    public Circle(float radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void setY(int y) {
        this.y = y;
    }
}
