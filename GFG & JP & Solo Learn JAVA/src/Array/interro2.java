package Array;

public class interro2 {
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 14;
        number[1] = 22;
        number[2] = 37;
        number[3] = 50;
        number[4] = 90;

        System.out.println(number[0]);
        System.out.println(number[3]);
        System.out.println(number[4]);

        int len = number.length;
        System.out.println("Array size = " +len);
    }
}
