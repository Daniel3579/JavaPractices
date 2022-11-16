package Lab_1;

public class Factorial {
    private int a;
    private int b = 1;
    private boolean f;

    public Factorial(int a) {
        if (a >= 0) {
            int i;

            for (i = 1; i <= a; i++) {
                b *= i;
            }

            this.a = a;
            f = true;

        } else {
            f = false;
        }
    }

    public String toString() {
        if (f) {
            return "Lab_2.Factorial " + a + " = " + b;

        } else {
            return "Error... The number is less than zero";
        }
    }
}
