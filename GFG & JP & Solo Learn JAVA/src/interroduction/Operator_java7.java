package interroduction;

import java.util.Scanner;

public class Operator_java7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius,fahrenheit;
        System.out.print("Enter celsius : ");
        celsius = input.nextDouble();

        fahrenheit = (((9.0/5)*celsius)+32);
        System.out.println("Fahrenheit : " + fahrenheit);
    }
}
