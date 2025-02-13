package lab05.TheMyTimeClass;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(12, 30, 45);

        System.out.printf("Current time: %s%n", time);
        //Getter
        System.out.printf("Hour: %s%n", time.getHour());
        System.out.printf("Minute: %s%n", time.getMinute());
        System.out.printf("Second: %s%n", time.getSecond());

        //Setter
        time.setHour(22);
        time.setMinute(58);
        time.setSecond(59);
        System.out.printf("Now time: %s%n", time);

        //nextSecond, nextMinute, nextHour
        System.out.printf("Next Second: %s%n", time.nextSecond());
        System.out.printf("Next Minute: %s%n", time.nextMinute());
        System.out.printf("Next Hour: %s%n", time.nextHour());

        //previousSecond, nextMinute, nextHour
        System.out.printf("Previous Second: %s%n", time.previousSecond());
        System.out.printf("Previous Minute: %s%n", time.previousMinute());
        System.out.printf("Previous Hour: %s%n", time.previousHour());

        MyTime time1 = new MyTime(1, 0, 0);

        // Test previousSecond(), previousMinute(), previousHour()
        System.out.println("Initial Time: " + time1);
        System.out.println("Previous Second: " + time1.previousSecond());
        System.out.println("Previous Minute: " + time1.previousMinute());
        System.out.println("Previous Hour: " + time1.previousHour());

        //Invalid
        try {
            time.setMinute(70);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
