package interroduction;
public class Variable_datatypes {
    public static void main(String[] args) {
        boolean b;
        char c;
        //The short data type can store whole numbers from -32768 to 32767:
        short s = 32677;        //it contains only 5 numbers
        //The int data type can store whole numbers from -2147483648 to 2147483647.
        int i = 2147483647;     //it contains only 10 numbers
        //The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
        long lData = 190204738957L; //what if it contains L at last number.
        //You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
        //The float data type can store fractional numbers from 3.4e−038 to 3.4e+038.
        float f = 99.99f; //Note that you should end the value with an "f":
        //The double data type can store fractional numbers from 1.7e−308 to 1.7e+308.
        double d = 10.20d; //Note that you should end the value with a "d":
        b = true;
        System.out.println("Boolean  = " + b);
        c = 's';
        System.out.println("Character = " + c);
        System.out.println("Short = " + s);
        System.out.println("Integer Data = " + i);
        System.out.println("Long Data = " + lData);
        System.out.println("Floating Point Value = " + f);
        System.out.println("Double value = " + d);
        //A floating point number can also be a scientific number with an "e" to indicate the power of 10:
        float Scientific1 = 35e3f;
        double Scientific2 = 12E4d;
        System.out.println("Scientific Numbers1: " + Scientific1);
        System.out.println("Scientific Numbers2: " + Scientific2);
        //Alternatively, you can use ASCII values to display certain characters:
        char myVar1 = 65, myVar2 = 66;
        System.out.println(myVar1); System.out.println(myVar2); //Answer A , B
    }
}
