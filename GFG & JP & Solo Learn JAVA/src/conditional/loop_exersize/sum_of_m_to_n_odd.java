package conditional.loop_exersize;

import java.util.Scanner;

public class sum_of_m_to_n_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int m, n;
        System.out.println("Enter initial number : ");
        m = input.nextInt();
        System.out.println("Enter end number :");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) { //form 1 to 10 odd are 1,3,5,7,9 which are equal 25
                sum = sum + i;
            }
        }
        System.out.println("The sum is : "+sum);
    }
}
