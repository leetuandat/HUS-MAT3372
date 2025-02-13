package lab05.TheMyDateClass;

public class MyDate {
    private int year;
    private int month;
    private int day;

    private String[] MONTHS = {"Jan", "Feb", "March",
                                "Apr", "May", "Jun",
                                "Jul", "Aug", "Sep",
                                "Oct", "Nov", "Dec"};
    private String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday",
    "Thursday", "Friday", "Saturday"};
    private int[] DAYS_IN_MONTHS = {31, 28, 31, 30,
                                    31, 30, 31, 31,
                                    30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }

        int daysInEachMonth = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            daysInEachMonth = 29;
        }

        return day >= 1 && day <= daysInEachMonth;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        //Zeller's congruence
        int century = year / 100;
        year %= 100;
        int dayOfWeek = ((day - 1 + (13 * (month + 1)) / 5 + year + (year / 4) + (century / 4) - (2 * century)) % 7);
        if (dayOfWeek < 0) {
            dayOfWeek += 7;
        }
        return dayOfWeek;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        return String.format("%s %s %s %s", DAYS[getDayOfWeek(year, month, day)], day,
                MONTHS[month - 1], year);
    }

    public MyDate nextDay() {
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        day++;
        if (day > maxDay) {
            day = 1;
            nextMonth();
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            nextYear();
        }
        return this;
    }

    public MyDate nextYear() {
        if (year == 9999) {
            throw new IllegalStateException("Year out of range!");
        }
        year++;
        return this;
    }

    public MyDate previousDay() {
        if (day == 1) {
            if (month == 1) {
                year--;
                month = 12;
            } else {
                month--;
            }

            int maxDays = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                maxDays = 29;
            }

            day = maxDays;
        } else {
            day--;
        }

        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            year--;
            month = 12;
        } else {
            month--;
        }

        int maxDays = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDays = 29;
        }

        if (day > maxDays) {
            day = maxDays;
        }

        return this;
    }

    public MyDate previousYear() {
        if (year == 1) {
            throw new IllegalStateException("Year out of range!");
        }
        year--;

        int maxDays = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDays = 29;
        }

        if (day > maxDays) {
            day = maxDays;
        }

        return this;
    }
}
