package project3;

public class MethodDemo {
    public static void main(String[] args) {
        // Calling a method with no parameters and no return value
        printHello();

        // Calling a method with one parameter and no return value
        printName("John");

        // Calling a method with multiple parameters and a return value
        int sum = addNumbers(5, 10);
        System.out.println("Sum of 5 and 10 is " + sum);
    }

    // Method with no parameters and no return value
    public static void printHello() {
        System.out.println("Hello!");
    }

    // Method with one parameter and no return value
    public static void printName(String name) {
        System.out.println("Your name is " + name);
    }

    // Method with multiple parameters and a return value
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
