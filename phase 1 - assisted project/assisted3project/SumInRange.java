package assisted3project;

public class SumInRange {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
        int L = 2;
        int R = 5;

        int sum = findSumInRange(array, n, L, R);

        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sum);
    }

    public static int findSumInRange(int[] array, int n, int L, int R) {
        if (L < 0 || R >= n || L > R) {
            throw new IllegalArgumentException("Invalid range");
        }

        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += array[i];
        }

        return sum;
    }
}
