

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Solves a linear equation using y = mx + b.
 *
 * @author Carel
 * @version 1.0
 * @since 2026-10-03
 */
public  final class LinearEquation {

    // Prevents instantiation.
    private LinearEquation() {
    }

    /**
     * Starts the program.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer;

        // Repeat while the user enters y.
        do {
            try {
                // Choose the variable to solve for.
                System.out.print("Solve for y, m, x, or b: ");
                char variable = scanner.next().toLowerCase().charAt(0);

                // Solve for y.
                if (variable == 'y') {
                    System.out.print("Enter m, x, and b: ");
                    double m = scanner.nextDouble();
                    double x = scanner.nextDouble();
                    double b = scanner.nextDouble();

                    System.out.println("y = " + (m * x + b));

                // Solve for m.
                } else if (variable == 'm') {
                    System.out.print("Enter y, x, and b: ");
                    double y = scanner.nextDouble();
                    double x = scanner.nextDouble();
                    double b = scanner.nextDouble();

                    if (x != 0) {
                        System.out.println("m = " + ((y - b) / x));
                    } else {
                        System.out.println("Cannot solve when x is zero.");
                    }

                // Solve for x.
                } else if (variable == 'x') {
                    System.out.print("Enter y, m, and b: ");
                    double y = scanner.nextDouble();
                    double m = scanner.nextDouble();
                    double b = scanner.nextDouble();

                    if (m != 0) {
                        System.out.println("x = " + ((y - b) / m));
                    } else {
                        System.out.println("Cannot solve when m is zero.");
                    }

                // Solve for b.
                } else if (variable == 'b') {
                    System.out.print("Enter y, m, and x: ");
                    double y = scanner.nextDouble();
                    double m = scanner.nextDouble();
                    double x = scanner.nextDouble();

                    System.out.println("b = " + (y - m * x));

                } else {
                    System.out.println("Please choose y, m, x, or b.");
                }

            } catch (InputMismatchException e) {
                // Handle invalid number input.
                System.out.println("Invalid input. Please enter numbers.");
            }

            // Clear leftover input.
            scanner.nextLine();

            // Ask whether to continue.
            System.out.print("Solve another? (y/n): ");
            String response = scanner.nextLine().trim().toLowerCase();

            answer = response.length() > 0
                    ? response.charAt(0) : 'n';

        } while (answer == 'y');

        scanner.close();
        System.out.println("Goodbye!");
    }
}

