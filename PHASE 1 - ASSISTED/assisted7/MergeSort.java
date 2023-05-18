package assisted7;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return; // Array is already sorted
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Populate the left and right subarrays
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left); // Recursively sort the left subarray
        mergeSort(right); // Recursively sort the right subarray

        merge(arr, left, right); // Merge the sorted subarrays
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0; // Index for left subarray
        int j = 0; // Index for right subarray
        int k = 0; // Index for merged array

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left subarray, if any
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements of right subarray, if any
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
