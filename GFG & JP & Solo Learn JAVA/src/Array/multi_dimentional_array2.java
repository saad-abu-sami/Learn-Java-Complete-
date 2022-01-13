package Array;

import java.util.Scanner;

public class multi_dimentional_array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        //it means row 2, column 3

        //getting input for A matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
            }
        }
        //printing A matrix
        System.out.println("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(A[row][col]);
            }
        }
    }
}
