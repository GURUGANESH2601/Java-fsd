package assisted2project;

import java.util.Arrays;

public class FourthSmallestElement {
    public static void main(String[] args) {
        int[] list = {10, 5, 8, 3, 9, 7, 1, 6, 4};
        int fourthSmallest = findFourthSmallest(list);

        System.out.println("Fourth smallest element: " + fourthSmallest);
    }

    public static int findFourthSmallest(int[] list) {
        if (list.length < 4) {
            throw new IllegalArgumentException("List should contain at least 4 elements");
        }

        Arrays.sort(list);

        return list[3];
    }
}