package CF;
import java.util.*;
public class cf_472A {
    public static void main(String[] args) {
        //8 & 9 both are composit number, So whatever we take any number from there one number is 8 and other is 9
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m = n % 2 + 8;//So, we do +8. So that if the number is even then it is 8, else odd number is 8+1=9
        System.out.printf("%d %d", m, n - m);
    }
}
