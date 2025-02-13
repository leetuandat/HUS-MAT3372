package lab02;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = generateStudentGrade(scanner);
        simpleGradesStatistics(grades);
        scanner.close();
    }

    public static int[] generateStudentGrade(Scanner in) {
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        in.nextLine();
        if (numStudents <= 0) {
            System.err.println("Invalid number of students!");
            return new int[0];
        }
        int[] grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Enter grade for student %d: ", i + 1);
            int grade = in.nextInt();
            if (grade < 0 || grade > 100) {
                System.err.println("Invalid grade!");
                return new int[0];
            }
            grades[i] = grade;
        }
        return grades;
    }

    public static void simpleGradesStatistics(int[] grades) {
        if (grades.length == 0) {
            System.out.println("No grades to calculate statistics.");
            return;
        }
        int sum = 0;
        int min = grades[0];
        int max = grades[0];
        for (int grade : grades) {
            sum += grade;
            if (grade < min) {
                min = grade;
            }
            if (grade > max) {
                max = grade;
            }
        }
        double average = (double) sum / grades.length;
        System.out.printf("Average grade: %.2f%n", average);
        System.out.println("Minimum grade: " + min);
        System.out.println("Maximum grade: " + max);
    }
}
