import java.util.Scanner;
public class test_java {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        for(int i = 0; i < num; i++) {
            if (i%2==0) {
                System.out.print(i + " ");
            }
            if(i%2 != 0){
                System.out.println(i + " ");
            }
        }
    }

}
