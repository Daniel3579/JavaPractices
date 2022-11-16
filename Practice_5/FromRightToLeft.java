package Practice_5;

import java.util.Scanner;

public class FromRightToLeft {
    private int number;

    public FromRightToLeft() {
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
    }

    public int rightToLeft() {
        System.out.println(number % 10);
        if (number / 10 == 0) {
            return number;

        } else {
            number /= 10;
            return rightToLeft();
        }
    }
}