package String;
import java.util.*;
public class string_basic {
    public static void main(String[] args) {
        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // the length of a string can be found with the length() method:
        System.out.println("The length of the txt1 string is: " + txt1.length());
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());
        /*The indexOf() method returns the index (the position) of the first occurrence of a specified text
         in a string (including whitespace):*/
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate"));
        //The + operator can be used between strings to combine them. This is called concatenation:
        String firstName1 = "John";
        String lastName1 = "Doe";
        System.out.println(firstName1 + " " + lastName1);
        //You can also use the concat() method to concatenate two strings:
        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName1.concat(lastName2));
        //The sequence \"  inserts a double quote in a string:
        String txt4 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt4);
        //The sequence \'  inserts a single quote in a string:
        String txt5 = "It\'s alright.";
        System.out.println(txt5);
        //The sequence \\  inserts a single backslash in a string:
        String txt6 = "The character \\ is called backslash.";
        System.out.println(txt6);

    }
}
