package math;

public class Math_1 {
    public static void main(String[] args) {
        int x =10;
        int y = -20;
        System.out.println(Math.min(x, y));
        int max = Math.max(x, y);
        System.out.println("Maximum number is : "+max);
        int absolute = Math.abs(y);
        System.out.println("Absolute value of y is : " + absolute);
        double power = Math.pow(y, x);
        System.out.println("Power of y^x is : " + power);

    }
}
