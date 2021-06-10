package conditional;

public class Bitwise_op2 {
    public static void main(String[] args) {
        int a=32;
        int c;

        c = a >> 3;
        // it means 32/2 3rd time, 32/2=16; 16/2=8; 8/2=4;
        System.out.println("a >> 3 = " + c);
        c = a << 3;
        // it means 32*2 3rd time, 32*2=64; 64*2=128; 128*2=256;
        System.out.println("a << 3 = " + c);
    }
}
