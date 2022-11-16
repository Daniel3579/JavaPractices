package Lab_2;

import java.util.Scanner;

public class TestHuman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int years = input.nextInt();
        int exp = input.nextInt();
        int savvy = input.nextInt();
        int intelligence = input.nextInt();
        int weight = input.nextInt();
        int endurance = input.nextInt();
        int power = input.nextInt();
        int speed = input.nextInt();
        input.nextLine();
        String hobbies = input.nextLine();
        String phobias = input.nextLine();

        Human h = new Human(
                name,
                years,
                exp,
                savvy,
                intelligence,
                weight,
                endurance,
                power,
                speed,
                hobbies,
                phobias
        );

        System.out.print(h);
    }
}
