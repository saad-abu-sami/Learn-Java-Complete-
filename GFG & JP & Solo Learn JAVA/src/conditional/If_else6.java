package conditional;

import java.util.Scanner;
public class If_else6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any character : ");
        ch = input.next().charAt(1);
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I'
                || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
