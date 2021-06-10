package conditional.loop_exersize;

import java.util.Scanner;
public class Time_table1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any number : ");
        num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i+" = " + num * i);
            // here num=which number i need; then i for 1 to 10; then num*1=5*1=5
        }
    }
}
