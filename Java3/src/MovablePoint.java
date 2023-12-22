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

    public String toString() {
        return null;
    }
    @Override
    public void moveUp() {
        System.out.println("move up");
    }

    @Override
    public void moveDown() {
        System.out.println("move down");
    }

    @Override
    public void moveLeft() {
        System.out.println("move left");
    }

    @Override
    public void moveRight() {
        System.out.println("move right");
    }
}
