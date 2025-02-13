package lab01;

public class PrintDayInWord {
    public static void main(String[] args) {
        System.out.println("Using nested-if: ");
        getDayByIf(0);
        getDayByIf(1);
        getDayByIf(2);
        getDayByIf(3);
        getDayByIf(4);
        getDayByIf(5);
        getDayByIf(6);
        getDayByIf(7);
        System.out.println("Using switch-case-default: ");
        getDayBySwitch(0);
        getDayBySwitch(1);
        getDayBySwitch(2);
        getDayBySwitch(3);
        getDayBySwitch(4);
        getDayBySwitch(5);
        getDayBySwitch(6);
        getDayBySwitch(7);
    }

    public static void getDayByIf(int number) {
        if (number == 0) {
            System.out.println("MONDAY");
        } else if (number == 1) {
            System.out.println("TUESDAY");
        } else if (number == 2) {
            System.out.println("WEDNESDAY");
        } else if (number == 3) {
            System.out.println("THURSDAY");
        } else if (number == 4) {
            System.out.println("FRIDAY");
        } else if (number == 5) {
            System.out.println("SATURDAY");
        } else if (number == 6) {
            System.out.println("SUNDAY");
        } else {
            System.out.println("Not a valid day");
        }
    }

    public static void getDayBySwitch(int number) {
        switch (number) {
            case 0:
                System.out.println("MONDAY");
                break;
            case 1:
                System.out.println("TUESDAY");
                break;
            case 2:
                System.out.println("WEDNESDAY");
                break;
            case 3:
                System.out.println("THURSDAY");
                break;
            case 4:
                System.out.println("FRIDAY");
                break;
            case 5:
                System.out.println("SATURDAY");
                break;
            case 6:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
