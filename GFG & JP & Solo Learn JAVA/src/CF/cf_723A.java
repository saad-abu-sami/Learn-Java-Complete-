package CF;
import java.util.*;
public class cf_723A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((Math.abs(b-a)+Math.abs(c-b)+Math.abs(a-c))/2);
    }
}
