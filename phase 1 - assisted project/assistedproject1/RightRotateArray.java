package assistedproject1;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int steps = 5;

        System.out.println("Original Array: ");
        printArray(array);

        rightRotateArray(array, steps);

        System.out.println("Array after right rotation: ");
        printArray(array);
    }

    public static void rightRotateArray(int[] array, int steps) {
        int length = array.length;
        steps = steps % length; // Adjusting steps in case it's greater than the array length

        reverseArray(array, 0, length - 1);
        reverseArray(array, 0, steps - 1);
        reverseArray(array, steps, length - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}