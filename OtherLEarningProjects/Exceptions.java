// Exceptions.java
// Isaiah Stuffle

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    // Main function
    public static void main(String[] args) {

        // Create a scanner input
        Scanner input = new Scanner(System.in);

        //Declare the varibles
        int num, denom;
        float ratio;

        // Loop until successful
        while (true) {
            try{
                // Prompt the user to an integer to add to the sum
                System.out.print("Enter an integer for the numerator: ");
                num = input.nextInt();
                System.out.print("Enter an integer for the denominator: ");
                denom = input.nextInt();

                if (denom == 0) {
                    throw new ArithmeticException("Denominator cannot be zero");
                }

                // If no exception, then calculate and display the result

                // compute the ratio
                ratio = (float)num / denom;

                // display the ratio
                System.out.println(num + " / " + denom + " = " + ratio);

                // successful exit
                break;
            }
            // Catch the exceptions
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
            }
            catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
