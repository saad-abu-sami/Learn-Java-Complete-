package Array;

import java.util.Arrays;

public class Sorting_array_withPosition {
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input array
        // It contains 8 elements as follows
        int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 5);

        // Printing the updated array which is
        // sorted after 2 index inclusive till 5th index
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
    }
}
