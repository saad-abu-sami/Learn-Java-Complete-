package Array.ArrayList;

import java.util.ArrayList;

public class interro5 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        number1.add(11);
        number1.add(13);
        number1.add(14);
        number1.add(15);
        System.out.println("Number1 : " +number1);
        number2.add(21);
        number2.add(23);
        number2.add(24);
        number2.add(25);
        System.out.println("Number2 : " +number2);
        number3.addAll(number1 );
        System.out.println("Number3 : " +number3);
        boolean result = number1.equals(number2);
        System.out.println("Number1 == Number2 : " +result);
        result = number1.equals(number3);
        System.out.println("Number1 == Number3 : " +result);

    }
}
