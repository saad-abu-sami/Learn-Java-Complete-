package interroduction;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter any integer number : ");
        number = input.nextInt();
        System.out.println("Number = "+number);
    }
}
