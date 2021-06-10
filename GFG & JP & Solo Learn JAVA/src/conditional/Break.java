package conditional;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                break; //if i=10 then break the for loop, not print 10 or more
            }
            System.out.println(i);
        }
    }
}
