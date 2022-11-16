package Practice_5;

import java.util.Scanner;

public class TaskSeventeen {
    Scanner input = new Scanner(System.in);

    public void fun(Integer max) {
        int n;

        n = input.nextInt();

        if (n == 0) {
            System.out.println(max);

        } else {
            if (n > max) {
                max = n;
            }

            fun(max);
        }
    }
}
