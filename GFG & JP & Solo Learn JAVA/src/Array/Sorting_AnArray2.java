package Array;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_AnArray2 {
    public static void main(String[] args) {
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};

        Arrays.sort(arr);
        // Printing the updated array which is
        // sorted arr[] in ascending order
        System.out.printf("Modified arr[Ascending] : %s", Arrays.toString(arr));
        System.out.println(" ");
        // Sorts arr[] in descending order using
        // reverseOrder() method of Collections class
        // in Array.sort() as an argument to it
        Arrays.sort(arr, Collections.reverseOrder());

        // Printing the array as generated above
        System.out.printf("Modified arr[Descending] : %s", Arrays.toString(arr));
    }
}
