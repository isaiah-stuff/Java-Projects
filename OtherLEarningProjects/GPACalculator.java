// GPACalculator.java
// Isaiah Stuffle
import java.util.Scanner;

public class GPACalculator {
    static char LetterGrades(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }

    public static void Questions() {
        Scanner input = new Scanner(System.in);

        int count;

        while (true) {
            System.out.print("How many grades (1-5): ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number between 1 and 5.");

                if (!input.hasNext()) {
                    System.out.println("No input available. Exiting program.");
                    return;
                }

                input.next();
                continue;
            }

            count = input.nextInt();

            if (count >= 1 && count <= 5) {
                break;
            }

            System.out.println("Invalid input. Please enter a number between 1 and 5.");
        }

        double sum = 0.0;

        for (int i = 0; i < count; i++) {
            double grade;

            while (true) {
                System.out.print("Enter grade " + (i + 1) + ": ");

                if (!input.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a numeric grade.");

                    if (!input.hasNext()) {
                        System.out.println("No input available. Exiting program.");
                        return;
                    }

                    input.next();
                    continue;
                }

                grade = input.nextDouble();

                if (grade >= 0 && grade <= 100) {
                    break;
                }

                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            }

            sum += grade;
        }

        double avg = sum / count;

        System.out.println("Average grade: " + avg);
        System.out.println("Your grade is: " + LetterGrades(avg));
    }

    public static void main(String[] args) {
        Questions();
    }
}