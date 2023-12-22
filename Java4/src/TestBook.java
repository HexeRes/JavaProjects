public class TestBook {
    public static void main(String[]args) {
        Book bk = new Book(1984, "Literally 1984", "SomeGuy");

        System.out.println("Before modification: ");
        System.out.println(bk);
        System.out.println("After modification using setters: ");
        bk.setYear(98);
        bk.setName("The Book of Egyptian Mains");
        bk.setAuthor("Pharaoh Chill I");
        System.out.println(bk);

    }
}
