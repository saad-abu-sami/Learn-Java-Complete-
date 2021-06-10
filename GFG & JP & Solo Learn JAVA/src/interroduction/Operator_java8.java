package interroduction;

import java.util.Scanner;

public class Operator_java8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.print("Enter fahrenheit : ");
        fahrenheit = input.nextDouble();

        celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Celsius : " + celsius);
    }
}
