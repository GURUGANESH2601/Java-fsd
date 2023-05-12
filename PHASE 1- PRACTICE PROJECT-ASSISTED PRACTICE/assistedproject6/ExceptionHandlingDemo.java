package assistedproject6;

import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int num = input.nextInt();
            int result = 10 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Invalid input");
        }

        System.out.println("Program completed.");
    }
}