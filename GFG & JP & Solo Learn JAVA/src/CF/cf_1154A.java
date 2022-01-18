package CF;
import java.util.*;
public class cf_1154A {
   public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[4];
       //according to problem it takes only 4 array integer that's why a[4]
		for(int i=0;i<4;i++) {
            //taking nextInt we get 4 integer by looping i (taking 3,6,5,4)
            arr[i] = s.nextInt();
        }
		Arrays.sort(arr);
       //from there we sort minimum to maximum value. That is [3,4,5,6] (the max is 6, So a[4]=6)
       //looping the four value a[0], a[1], a[2], a[3]
		for(int i=0;i<3;i++) {
            //here i<3 because a[3] is max value and that is 6, so the loop going under 3
            System.out.print(arr[3] - arr[i] + " ");
            //From there print a[3]-a[0]=6-3=3 ; a[3]-a[1]=6-4=2 ; a[3]-a[2]=6-5=1;
        }
	}
}
//Like before a+b=x1=40; b+c=x2=40; c+a=x3=40; a+b+c=x4= 60; Now a[3]-a[0]=20, a[3]-a[1]=20, a[3]-a[0]=20;
//Like before a+b=x1=101; b+c=x2=101; c+a=x3=200; a+b+c=x4= 201; Now a[3]-a[0]=100, a[3]-a[1]=100, a[3]-a[0]=1;
