public class MovablePoint implements Movable {

    private int x;

    private  int y;

    private int xSpeed;

    private int ySpeed;

    public  MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("move up");
        y = y + ySpeed;
    }

    @Override
    public void moveDown() {
        System.out.println("move down");
        y = y - ySpeed;
    }

    @Override
    public void moveLeft() {
        System.out.println("move left");
        x = x - xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void setSpeed(int xSpeed, int ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveRight() {
        System.out.println("move right");
        x = x + xSpeed;
    }
}
