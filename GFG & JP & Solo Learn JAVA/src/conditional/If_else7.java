package conditional;

import java.util.Scanner;

public class If_else7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter any Character : ");
        ch = input.next().charAt(0);
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println("English-Letter");
        }
        else {
            System.out.println("ETC");
        }
    }
}
