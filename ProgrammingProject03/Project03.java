// Project03.java
// Isaiah Stuffle

import java.util.Scanner;

public class Project03 {
    static void main(String[] args) {
        // Create an input object
        Scanner input = new Scanner(System.in);

        // Create a null Payment object
        Payment payment = null;

        // Loop until the user selects a valid object
        while (payment == null) {
            // Prompts the user to select an object
            System.out.print("Which object would you like to create? (1-6): ");
            int choice = input.nextInt();

            // Creates the object based on the user's choice
            switch (choice) {
                case 1:
                    payment = new DigitalPay(
                            100.00,
                            "Apple",
                            "Laptop"
                    );
                    break;
                case 2:
                    payment = new CreditCard(
                            100,
                            "Chase",
                            "1111111111111111"
                    );
                    break;
                case 3:
                    payment = new Liquid(
                            100,
                            "Register 02",
                            "Cash"
                    );
                    break;
                case 4:
                    payment = new DigitalPay(
                            100,
                            "Google",
                            "Phone"
                    );
                    break;
                case 5:
                    payment = new CreditCard(
                            1000,
                            "Capitol One",
                            "222222222222222"
                    );
                    break;
                case 6:
                    payment = new Liquid(
                            100000,
                            "Invoice",
                            "Check"
                    );
                    break;
                default:
                    // Sets a base case for invalid input
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        // Display the details of the object
        System.out.println(payment);
    }
}
