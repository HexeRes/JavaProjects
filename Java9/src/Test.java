public class Test {
    public static void main(String[] args) {
        Planet plernet = new Planet("new orleans");
        System.out.println(plernet.getName());
        Car lecar = new Car("PEEL P50", 500000);
        System.out.println("This car name " + lecar.getName() + " its price is " + lecar.getPrice() );
    }
}
