package CF;
import java.util.Scanner;
public class cf_1335A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0) {
            // If we take 3 for t the loop will be run 3 times.
            long n=sc.nextLong();
            System.out.println((n-1)/2);
            // According to theory value of n 0,1,2 the answer is zero.
            // If we take n=4 , then b will get 1 and a will get 3.
            // So 3+1=4; b>a ;
        }

    }
}
