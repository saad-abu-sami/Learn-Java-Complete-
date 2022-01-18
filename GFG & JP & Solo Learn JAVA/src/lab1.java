import java.util.*;
public class lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i, y = 0, z = 0, sum = 0, sum2 = 0, avg1, avg2;

        System.out.print("Even numbers are :");
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                System.out.print(" ");
                y++;
                sum = sum + i;

            }
        }
        System.out.println("");
        System.out.print("Sum of even number : ");
        System.out.println(sum);

        System.out.print("Odd numbers are :");
        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
                System.out.print(" ");
                z++;
                sum2 = sum2 + i;
            }
        }
        System.out.println("");
        System.out.print("Sum of odd number : ");
        System.out.println(sum2);

        avg1 = sum / y;
        avg2 = sum2 / z;

        System.out.println("\n");
        System.out.println("Avg of even number " + avg1);
        System.out.println("Avg of odd number " + avg2);
    }
}
