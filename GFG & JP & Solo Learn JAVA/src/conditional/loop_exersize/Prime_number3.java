package conditional.loop_exersize;

import java.util.Scanner;

public class Prime_number3 {
    public static void main(String[] args) {
        int m, n, count = 0, numoFprime = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter initial number: ");
        m = input.nextInt();
        System.out.println("Enter final number: ");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
                numoFprime++;
            }
            count = 0;
        }
        System.out.println("Total prime number = "+numoFprime);
    }
}
