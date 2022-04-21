package String.Method;
import java.util.*;

public class charAT {
    public static void main(String[] args) {
        String name1="javatpoint";
        char ch1=name1.charAt(4);//returns the char value at the 4th index
        System.out.println(ch1);
        String str1 = "Welcome to Javatpoint portal";
        int str1Length = str1.length();
        // Fetching first character
        System.out.println("Character at 0 index is: "+ str1.charAt(0));
        // The last Character is present at the string length-1 index
        System.out.println("Character at last index is: " + str1.charAt(str1Length - 1));
        //Print Characters Presented at Odd Positions by Using the charAt() Method
        String str2 = "Welcome to Java";
        for (int i=0; i<=str2.length()-1; i++) {
            if (i % 2 != 0) {
                System.out.println("Char at " + i + " place " + str2.charAt(i));
            }
        }
        //Counting Frequency of a character in a String by Using the charAt() Method
        String str = "Welcome to Javatpoint portal";
        int count = 0;
        for (int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i) == 't') {
                count++;
            }
        }
        System.out.println("Frequency of t is: "+count);
    }
}
