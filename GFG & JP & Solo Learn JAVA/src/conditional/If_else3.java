package conditional;

import java.util.Scanner;

public class If_else3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter any integer : ");
        number = input.nextInt();
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        // checks if number is less than 0
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        // if both condition is false
        else {
            System.out.println("The number is 0.");
        }
    }
}
