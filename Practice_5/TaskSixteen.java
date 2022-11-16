package Practice_5;

import java.util.Scanner;

public class TaskSixteen {
    Scanner input = new Scanner(System.in);

    public void fun(Integer max, Integer counter) {
        int n;

        n = input.nextInt();

        if (n == 0) {
            System.out.println(counter);

        } else {
            if (n > max) {
                max = n;
                counter = 1;

            } else if (n == max) {
                counter++;
            }
            fun(max, counter);
        }
    }
}
