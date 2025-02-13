package lab01;
public class Factorial {
    public static void main(String[] args) {
        double n = 20;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The JavaBasic.Factorial of " + n + " is " + factorial);
    }
}
