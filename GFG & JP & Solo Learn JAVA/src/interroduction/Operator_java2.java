package interroduction;

import java.util.Scanner;
public class Operator_java2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2,result;
        System.out.println("Enter first number : ");
        num1 = input.nextInt();
        System.out.println("Enter second number : ");
        num2 = input.nextInt();
        result = num1 + num2;
        System.out.println("Sum = " + result);
        result = num1 - num2;
        System.out.println("Sub = " + result);
        result = num1 * num2;
        System.out.println("Multiplication = " + result);
        result = num1 / num2;
        System.out.println("Division = " + result);
        result = num1 % num2;
        System.out.println("Reminder = " + result);
    }
}
