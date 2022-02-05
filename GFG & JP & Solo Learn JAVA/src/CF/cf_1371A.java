package CF;
import java.util.*;
public class cf_1371A {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();//here t means how many stick we have
        while(t-->0){     //If we take input 6 for the stick
            int n = s.nextInt();//here n is the stick size
            System.out.printf("%d\n", n / 2 + n % 2);
            //((7/2+7%2)=4),((8/2+8%2)=4),((9/2+9%2)=5),((10/2+10%2)=5)
            //like these 1 and 2 values stick together we make 1 length two sticks.
        }
    }
}
