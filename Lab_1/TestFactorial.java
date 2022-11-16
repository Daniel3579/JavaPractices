package Lab_1;

import java.util.Scanner;

public class TestFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        Factorial a = new Factorial(number);

        System.out.print(a);
    }
}
