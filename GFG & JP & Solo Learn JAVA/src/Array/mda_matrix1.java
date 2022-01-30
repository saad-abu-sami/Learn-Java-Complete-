package Array;
import java.util.*;
public class mda_matrix1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3]; //As we sum of the matrix so, A & B both have same row and column 2,3
        int[][] B = new int[2][3];
        System.out.println("Enter elements for A matrix : ");
        //Now getting input for A matrix
        for (int row = 0 ; row < 2 ; row++){ //we take row 2 that it's row going for two
            for(int col = 0 ; col < 3 ; col++){ //we take col 3 that it's col going for two
                System.out.printf("A[%d][%d] = ",row,col);
                A [row][col] = input.nextInt();
            }
        }
        System.out.println("Enter elements for B matrix : ");
        //Now getting input for B matrix
        for (int row = 0 ; row < 2 ; row++){ //we take row 2 that it's row going for two
            for(int col = 0 ; col < 3 ; col++){ //we take col 3 that it's col going for two
                System.out.printf("B[%d][%d] = ",row,col);
                B [row][col] = input.nextInt();
            }
        }
        System.out.print("\n");
        //Now printing A matrix
        System.out.print("A =");
        for (int row = 0 ; row < 2 ; row++){ //First loop cover first 2 row
            for (int col = 0; col < 3; col++) { //Second loop cover three column
                System.out.print("\t "+A[row][col]);
            }
            System.out.println(); //Here we take a println because after printing 1st row we need a line gap
        }
        System.out.print("\n");
        //Now printing B matrix
        System.out.print("B =");
        for (int row = 0 ; row < 2 ; row++){ //First loop cover first 2 row
            for (int col = 0; col < 3; col++) { //Second loop cover three column
                System.out.print("\t "+B[row][col]);
            }
            System.out.println(); //Here we take a println because after printing 1st row we need a line gap
        }
        System.out.print("\n");
        System.out.println("A+B = "); //Adding A and B matrix
        for (int row = 0 ; row < 2 ; row++){ //First loop cover first 2 row
            for (int col = 0; col < 3; col++) { //Second loop cover three column
                System.out.print("\t "+(A[row][col]+B[row][col]));
            }
            System.out.println();
        }
    }
}
