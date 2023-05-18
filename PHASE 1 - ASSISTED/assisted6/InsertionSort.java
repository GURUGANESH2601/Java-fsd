package assisted6;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {26, 46, 56, 16, 06};
        System.out.println("Original array: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
