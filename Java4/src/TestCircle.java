public class TestCircle {
    public static void main(String[] args) {
        Circle crl = new Circle(5, 6,8);

        System.out.println("Before modification: ");
        System.out.println(crl);
        System.out.println("After modification using setters: ");
        crl.setX(98);
        crl.setY(33);
        crl.setRadius(100);
        System.out.println(crl);

    }
}
