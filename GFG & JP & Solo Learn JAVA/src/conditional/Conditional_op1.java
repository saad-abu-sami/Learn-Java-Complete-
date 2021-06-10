package conditional;

import java.util.Scanner;

public class Conditional_op1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, large;
        System.out.print("Enter 2 int number : ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        large = (num1 > num2) ? num1 : num2;
        System.out.println("Large number : " + large);
    }
}
