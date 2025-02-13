package lab01;

public class PrintNumberInWord {
    public static void main(String[] args) {
        System.out.println("Using nested-if: ");
        printNumberInWordByNestedIf(1);
        printNumberInWordByNestedIf(2);
        printNumberInWordByNestedIf(3);
        printNumberInWordByNestedIf(4);
        printNumberInWordByNestedIf(5);
        printNumberInWordByNestedIf(6);
        printNumberInWordByNestedIf(7);
        printNumberInWordByNestedIf(8);
        printNumberInWordByNestedIf(9);
        printNumberInWordByNestedIf(10);
        System.out.println("Using switch-case-default: ");
        printNumberInWordBySwitchCaseDefault(1);
        printNumberInWordBySwitchCaseDefault(2);
        printNumberInWordBySwitchCaseDefault(3);
        printNumberInWordBySwitchCaseDefault(4);
        printNumberInWordBySwitchCaseDefault(5);
        printNumberInWordBySwitchCaseDefault(6);
        printNumberInWordBySwitchCaseDefault(7);
        printNumberInWordBySwitchCaseDefault(8);
        printNumberInWordBySwitchCaseDefault(9);
        printNumberInWordBySwitchCaseDefault(10);
    }

    public static void printNumberInWordByNestedIf(int number) {
        System.out.println("The number is: " + number);
        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }

    public static void printNumberInWordBySwitchCaseDefault(int number) {
        System.out.println("The number is: " + number);
        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}
