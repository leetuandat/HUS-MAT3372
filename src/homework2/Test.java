package homework2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        factorialInt();
    }

    public static void factorialInt() {
        int i = 1;
        int factorial = 1;

        System.out.println("Factorials that can be expressed as an int:");
        while (true) {
            // Check if the factorial exceeds the int range
            if (factorial <= 0) {
                break;
            }
            System.out.println("Factorial of " + i + ": " + factorial);

            // Update factorial and increment i
            i++;
            factorial *= i;
        }
    }
}
