package shubham;

import java.util.Scanner;

public class SquareRootCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");

        try {
            double number = scanner.nextDouble();

            if (number < 0) {
                throw new Exception("Number cannot be negative");
            }

            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is " + squareRoot);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }
}

