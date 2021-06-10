package conditional.loop_exersize;
import java.util.Scanner;
public class Nested_loop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.println("Enter Initial Number : ");
        m = input.nextInt();
        System.out.println("Enter Final Number : ");
        n = input.nextInt();
        //For running namta from m to n
        for (int i = m; i <= n; i++) {
            //Initial i=n ; i loop going till n; i++ for going m to n
            for (int j = 1; j <= 10; j++) {
            //here num=which number i need; then i for 1 to 10; then num*1=5*1=5
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
    }
}
