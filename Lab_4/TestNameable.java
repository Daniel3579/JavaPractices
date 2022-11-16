package Lab_4;

public class TestNameable {
    public static void main(String[] args) {
        Planet p = new Planet("Pizza");
        Car c = new Car("Tesla");

        System.out.println(p.getName());
        System.out.println(c.getName());
    }
}
