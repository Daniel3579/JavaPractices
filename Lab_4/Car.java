package Lab_4;

public class Car implements Nameable {
    private String car_name;

    public Car(String name) {
        car_name = name;
    }

    @Override
    public String getName() {
        return car_name;
    }
}
