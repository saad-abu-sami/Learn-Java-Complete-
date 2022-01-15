package CF;
import java.util.Scanner;
import static java.lang.Math.abs;

public class cf_581A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.min(a, b) + " " +  Math.abs(a - b)/2);
        //If number of 4,10; 4<10 ; 1st answer 4; (abs(4-10))/2=3; 2nd answer 3;
        //If number of 7,3; 7<!3 ; 1st answer 3; (abs(7-3))/2=2; 2nd answer 2;
        //If number of 100,100; as 100==100 ; 1st answer 100; (abs(100-100))/2=0; 2nd answer 0;
        //If number of 100,45; 100<!45 ; 1st answer 45; (abs(100-45))/2=27; 2nd answer 27;
    }
}
