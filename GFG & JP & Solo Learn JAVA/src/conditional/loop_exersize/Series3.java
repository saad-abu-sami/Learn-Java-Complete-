package conditional.loop_exersize;

import java.util.Scanner;
public class Series3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, result = 1;
        System.out.println("Enter the last number : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "X" + i + " ");
            result = result * i * i;
        }
        System.out.println();
        System.out.println("Result: " + result);
    }
}