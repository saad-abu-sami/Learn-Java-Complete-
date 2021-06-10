package interroduction;
import java.util.Scanner;
public class User_input_strig {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.println("Welcome : " + name);
    }
}
