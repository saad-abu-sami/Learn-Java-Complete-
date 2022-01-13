package Array;

import java.util.Scanner;

public class interro6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;
        System.out.println("Enter 5 numbers : ");
        for(int i = 0; i < 5; i++){
            number[i] = input.nextDouble();
        }
        for(int i = 0; i < 5 ; i++){
            sum = sum + number[i];
        }
        System.out.println("The sum is : " + sum);
        double avg = sum/number.length;
        System.out.println("Average is : "+avg);
    }
}
