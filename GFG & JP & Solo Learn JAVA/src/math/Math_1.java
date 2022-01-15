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
        System.out.println("Square root of 64 is: " + Math.sqrt(64));
        System.out.println("A random math number " +Math.random());
        // return the logarithm of given value
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));
        // return the logarithm of given value when base is 10
        System.out.println("log10 of x is: " + Math.log10(x));
        System.out.println("log10 of y is: " + Math.log10(y));
        // return the log of x + 1
        System.out.println("log1p of x is: " +Math.log1p(x));
        // return x power of 2
        System.out.println("exp of x is: " +Math.exp(x));
        // return (x power of 2)-1
        System.out.println("expm1 of x is: " +Math.expm1(x));
    }
}
