package conditional;

import java.util.Scanner;

public class If_else4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter any integer : ");
        number = input.nextInt();
        if(number%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
