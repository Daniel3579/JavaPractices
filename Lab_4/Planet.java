package Lab_4;

public class Planet implements Nameable{
    private String planet_name;

    Planet(String name) {
        planet_name = name;
    }

    @Override
    public String getName() {
        return planet_name;
    }
}
