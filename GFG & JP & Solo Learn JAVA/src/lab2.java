import java.util.*;
public class lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,col,n;
        n = input.nextInt();
        for(row=1;row<=n;row++) {
            for(col=1;col<=n-row;col++) {
                System.out.println(" ");
            }
        }
        for(col=1; col<= ((2*row)-1); col++){
            System.out.print(" " +row);
        }
        System.out.println(" ");
    }
}
