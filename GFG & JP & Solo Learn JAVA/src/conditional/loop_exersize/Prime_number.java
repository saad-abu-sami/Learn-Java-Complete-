package conditional.loop_exersize;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count=0;
        System.out.println("Enter any positive number : ");
        num = input.nextInt();
        for (int i = 2; i < num; i++) {
            //The prime number should divided by 1 or by that number only
            // So for getting not prime number we have to divided from 2 to before that num
            //For this for loop start with i=2;for before that num i<num; i++ for looping
            if (num % i == 0) {
                count++;
                //If count is 1 then break the if loop
                break;
                //If it break and count!=0 then it is not a prime number
            }
        }
        if (count == 0) {
            System.out.println("Prime Number");
        } else {

            System.out.println("Not Prime");
        }
    }
}
