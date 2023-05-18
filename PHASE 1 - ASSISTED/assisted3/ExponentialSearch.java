package assisted3;

public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;
        
        if (arr[0] == target) {
            return 0; // Element found at index 0
        }
        
        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2; // Double the index
        }
        
        return binarySearch(arr, target, i / 2, Math.min(i, n - 1));
    }
    
    public static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid; // Element found, return its index
            }
            
            if (arr[mid] < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }
        
        return -1; // Element not found
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 25, 30};
        int target = 10;
        int result = exponentialSearch(arr, target);
        
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
