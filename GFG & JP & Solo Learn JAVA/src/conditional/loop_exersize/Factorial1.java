package conditional.loop_exersize;

import java.util.Scanner;
public class Factorial1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, fact = 1;
        System.out.print("Enter any positive integer : ");
        num = input.nextInt();
        for (int i = num; i >= 1; i--) // 4!=4*3*2*1 so, i=num/4;i go to 1;for this i--
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+" = "+fact);
    }
}
