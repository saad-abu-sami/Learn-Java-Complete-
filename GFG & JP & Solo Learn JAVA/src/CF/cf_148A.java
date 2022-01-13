package CF;
import java.util.Scanner;
public class cf_148A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), l = sc.nextInt(), m = sc.nextInt(), n = sc.nextInt(), d = sc.nextInt(), r = 0;
        for (int i = 1; i <= d; i++) {
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0)
                //1%2=/=0||1%3=/=0|| 1%4=/=0|| 1%5=/=0, so p=0
                //2%2==0 so p=1 ; 3%3==0 so p=1+1=2 ; 4%4==0 so p=2+1=3 ;
                //Like these 2,3,4,5,6,8,9,10,12,14,15 = 11; These number are divided by 2,3,4,5;
                //But 1,7,11,13 are not divided by 2,3,4,5;
                r = r + 1;
        }
        System.out.print(r);
    }
}
