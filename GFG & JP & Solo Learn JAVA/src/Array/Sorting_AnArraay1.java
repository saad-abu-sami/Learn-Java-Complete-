package Array;

import java.util.Arrays;

public class Sorting_AnArraay1 {
    public static void main(String[] args) {
        int[] number = {10, -3, 18, 5, 25};
        Arrays.sort(number);
        System.out.println("Ascending : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+number[i]);
        }
        System.out.println();
        System.out.println("Descending : ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" "+number[i]);
        }
        System.out.println(" ");
        System.out.println(" ");
        String[] names = {"Sami", "Imaad", "Juel", "Niloy", "Anis"};
        Arrays.sort(names);
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + " ");
        }
        System.out.println(" ");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i] + " ");
        }
    }
}
