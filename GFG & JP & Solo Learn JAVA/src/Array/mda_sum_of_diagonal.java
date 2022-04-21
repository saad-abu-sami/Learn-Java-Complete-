package Array;
import java.util.*;
public class mda_sum_of_diagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int sumOFdiagonal = 0 ;
        int sumOFUpper = 0 ;
        int sumOFLower = 0 ;
        System.out.println("Give me Matrix Input: ");
        for(int row=0; row<3; row++){
            for(int col=0 ; col<3; col++){
                A[row][col] = input.nextInt();
            }
        }
        for(int row=0; row<3; row++){
            for (int col = 0; col < 3; col++) {
                if(row==col){
                    sumOFdiagonal += A[row][col];
                }
                if(row<col){
                    sumOFUpper += A[row][col];
                }
                if(row>col){
                    sumOFLower += A[row][col];
                }
            }
        }
        System.out.println("Sum of diagonal elements : " +sumOFdiagonal);
        System.out.println("Sum of upper elements : " +sumOFUpper);
        System.out.println("Sum of lower elements : " +sumOFLower);
    }
}
