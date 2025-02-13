package homework2;

import java.util.Scanner;

public class NestedLoopsExercise {
    public static void main(String[] args) {
        testSquarePattern();
        testCheckerPattern();
        testTimeTable();
        testTriangularPattern();
        testBoxPattern();
        testHillPattern();

    }
    //Square Pattern
    public static void squarePattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void squarePatternByWhileDoLoop(int n) {
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print("# ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void testSquarePattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SQUARE PATTERN");
        while (true) {
            System.out.println("Enter size: ");
            int size = scanner.nextInt();
            if (size > 0) {
                System.out.println("Square by for loop");
                squarePattern(size);
                System.out.println("Square by while-do loop");
                squarePatternByWhileDoLoop(size);
                break;
            } else {
                System.err.println("Size can't smaller than 1. Try again!");
                continue;
            }
        }
        System.out.println("_____________________");
    }
    //End Square Pattern

    //Checker Pattern
    public static void checkerPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row%2 == 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    public static void testCheckerPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHECKER PATTERN");
        while (true) {
            System.out.print("Enter the size: ");
            int size = scanner.nextInt();
            if (size > 0) {
                checkerPattern(size);
                break;
            } else {
                System.err.println("Size can't smaller than 1. Try again!");
                continue;
            }
        }
        System.out.println("_____________________");
    }
    //End Checker Pattern

    //Time Table
    public static void timeTable(int n) {
        for (int row = 1; row <= n; row++) {
            System.out.printf("%5d", row);
            System.out.print("  |");
            for (int col = 1; col <= n; col++) {
                System.out.printf("%5d", row*col);
            }
            System.out.println();
        }
    }

    public static void testTimeTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TIME TABLE");
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        //Header
        System.out.printf("%5s", "*");
        System.out.print("  |");
        for (int col = 1; col <= size; col++) {
            System.out.printf("%5d", col);
        }
        System.out.println();

        System.out.printf("%5s", "_____");
        System.out.print("___");
        for (int col = 1; col <= size; col++) {
            System.out.printf("%5s", "_____");
        }
        System.out.println();
        //End Header

        //Print Body
        timeTable(size);
        System.out.println("_____________________");
    }
    //End Time Table

    //Triangular Pattern
    public static void triangularPatternA(int n) {
        System.out.println("TRIANGULAR A");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatternB(int n) {
        System.out.println("TRIANGULAR B");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatternC(int n) {
        System.out.println("TRIANGULAR C");
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void triangularPatternD(int n) {
        System.out.println("TRIANGULAR D");
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row + 1; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void testTriangularPattern() {
        System.out.println("TRIANGULAR PATTERN");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();
        triangularPatternA(size);
        triangularPatternB(size);
        triangularPatternC(size);
        triangularPatternD(size);
    }
    //End Triangular Pattern

    //Box Pattern
    public static void boxPatternA(int n) {
        System.out.println("BOX A");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print((col == 0 || col == n - 1) ? "# " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternB(int n) {
        System.out.println("BOX B");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print((col == row) ? "# " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternC(int n) {
        System.out.println("BOX C");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print((col == n -row - 1) ? "# " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternD(int n) {
        System.out.println("BOX D");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print((col == row || col == n - row -1) ? "# " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void testBoxPattern() {
        System.out.println("BOX PATTERN");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();
        boxPatternA(size);
        boxPatternB(size);
        boxPatternC(size);
        boxPatternD(size);
    }
    //End Box Pattern

    //Hill Pattern
    public static void hillPatternA(int n) {
        System.out.println("HILL PATTERN A");
        int countChar = 0;
        for (int row = 1; row <= n; ++row, countChar = 0) {
            for (int space = 1; space <= n - row; ++space) {
                System.out.print("  ");
            }
            while (countChar != 2 * row - 1) {
                System.out.print("# ");
                ++countChar;
            }
            System.out.println();
        }
    }

    public static void hillPatternB(int n) {
        System.out.println("HILL PATTERN B");
        for(int row = n; row >= 1; --row) {
            for(int space = 1; space <= n - row; ++space) {
                System.out.print("  ");
            }
            for(int col = row; col <= 2 * row - 1; ++col) {
                System.out.print("# ");
            }
            for(int col = 0; col < row - 1; ++col) {
                System.out.print("# ");
            }

            System.out.println();
        }
    }

    public static void hillPatternC(int n) {
        System.out.println("HILL PATTERN C");
        int spaces = n - 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= spaces; col++) {
                System.out.print("  ");
            }
            spaces--;
            for (int countChar = 1; countChar <= 2 * row - 1; countChar++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        spaces = 1;
        for (int row = 1; row <= n - 1; row++) {
            for (int col = 1; col <= spaces; col++) {
                System.out.print("  ");
            }
            spaces++;
            for (int countChar = 1; countChar <= 2 * (n - row) - 1; countChar++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void hillPatternD(int n) {
        for (int row = 0; row < n * 2 - 1; row++) {
            for (int col = 0; col < n * 2 - 1; col++) {
                if (row == 0 || row == n * 2 - 2) {
                    System.out.print("# ");
                } else if (row <= n-1) {
                    int spaces = row * 2 - 1;
                    int indexStart = n - row;
                    int indexEnd = indexStart + spaces - 1;
                    System.out.print((col >= indexStart && col <= indexEnd)? "  " : "# ");
                } else {
                    int spaces = 2 * n - 1 - (row - n + 2) * 2;
                    int indexStart = row - n + 2;
                    int indexEnd = indexStart + spaces - 1;
                    System.out.print((col >= indexStart && col <= indexEnd)? "  " : "# ");
                }
            }
            System.out.println();
        }
    }

    public static void testHillPattern() {
        System.out.println("HILL PATTERN");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();
        hillPatternA(size);
        hillPatternB(size);
        hillPatternC(size);
        hillPatternD(size);
    }
    //End Hill Pattern
}
