package assistedproject5;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        try {
            if (num < 0) {
                throw new NegativeNumberException("Number cannot be negative");
            }
            int result = 10 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program completed.");
        }
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}