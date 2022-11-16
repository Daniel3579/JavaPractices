package Practice_1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("We", 237);
        Book b2 = new Book("Mobydick", 348);
        Book b3 = new Book("i;hf", 51);

        b3.setName("Board");
        b2.setPages(423);

        System.out.println(b1);
    }
}
