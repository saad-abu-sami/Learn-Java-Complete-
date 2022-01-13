package CF;
import java.util.Scanner;
public class cf_200B {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double n=s.nextInt(),sum=0;
        for(int i=0;i<n;i++)
            sum+=s.nextInt();
        System.out.println((double)sum/n);
    }
}
