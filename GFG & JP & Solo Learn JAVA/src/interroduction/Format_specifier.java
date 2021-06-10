package interroduction;

public class Format_specifier {
    public static void main(String[] args){
        boolean b = true;
        char c = 's';
        short s = 32677;
        int i = 99;
        float f = 99.99f; //always use f character with float data types
        double d = 10.205679;
        System.out.printf("boolean b = %b\n", b);
        System.out.printf("character c = %c\n", c);
        System.out.printf("short s = %s\n",s);
        System.out.printf("integer i = %d\n", i);
        System.out.printf("floatingpoint f = %.2f\n", f); //by default 6 digit after point
        System.out.printf("double d = %.3f\n", d); //.3f can change after point digit
    }
}
