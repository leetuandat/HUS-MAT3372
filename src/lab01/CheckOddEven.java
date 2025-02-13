package lab01;
public class CheckOddEven {
    public static void main(String[] args) {
        checkOddEven(0);
        checkOddEven(1);
        checkOddEven(88);
        checkOddEven(99);
        checkOddEven(-1);
        checkOddEven(-2);
    }
    public static void checkOddEven(int number) {
        System.out.println("The number is: " + number);
        System.out.println((number % 2 == 0) ? "Even Number" : "Odd Number");
        System.out.println("Bye!");
    }
}
