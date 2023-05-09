package project9;

public class ArrayDemo {
    public static void main(String[] args) {
        // declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        
        // print the values of the array
        System.out.println("Array of integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }
        
        // declare and initialize an array of strings
        String[] names = {"Alice", "Bob", "Charlie"};
        
        // print the values of the array
        System.out.println("Array of strings:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Element " + i + ": " + names[i]);
        }
        
        // declare an array of integers
        int[] primes = new int[5];
        
        // initialize the values of the array
        primes[0] = 2;
        primes[1] = 3;
        primes[2] = 5;
        primes[3] = 7;
        primes[4] = 11;
        
        // print the values of the array
        System.out.println("Array of prime numbers:");
        for (int i = 0; i < primes.length; i++) {
            System.out.println("Element " + i + ": " + primes[i]);
        }
    }
}