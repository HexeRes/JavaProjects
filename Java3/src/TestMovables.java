public class TestMovables {
    public static void main(String[] args) {
        MovableRectangle dabigbox = new MovableRectangle(2,3,5,7,4,10);
        MovableCircle decircle = new MovableCircle(1,2,4,5,5);
        decircle.moveDown();
        decircle.moveUp();
        System.out.println("---------");
        dabigbox.moveUp();
        dabigbox.moveDown();
    }
}
