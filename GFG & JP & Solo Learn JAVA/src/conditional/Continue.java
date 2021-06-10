package conditional;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 10) {
                continue; //if i=10 then continue the for loop, not print 10.
            }
            System.out.println(i); //without 10 print the rest of 1 to 20
        }
    }
}
