package Array;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_AnArray3 {
    public static void main(String[] args) {
        // Custom input string
        String arr[] = { "practice.geeksforgeeks.org",
                "quiz.geeksforgeeks.org",
                "code.geeksforgeeks.org" };

        // Sorts arr[] in ascending order
        Arrays.sort(arr);
        System.out.printf("Modified arr[] : \n%s\n\n",
                Arrays.toString(arr));

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Lastly printing the above array
        System.out.printf("Modified arr[] : \n%s\n\n",
                Arrays.toString(arr));
    }
}
