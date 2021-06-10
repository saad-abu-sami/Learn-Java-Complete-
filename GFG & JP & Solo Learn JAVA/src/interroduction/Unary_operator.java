package interroduction;

public class Unary_operator {
    public static void main(String[] args) {
        int x = 10;
        int result;
        result = +x;
        System.out.println("result = " + result); //line7 +x means its only 10
        result = -x;
        System.out.println("result = " + result); //line9 -x means (+10)*(-) so -10
        result = ++x;
        System.out.println("result = " + result); //line11 ++x means 10+1=11
        result = x++;
        System.out.println("result = " + result); //line13 x++ means 11+1=12 but be in line15
        result = --x;
        System.out.println("result = " + result); //from result line14 answer 12-1=11 in line16
        result = x--;
        System.out.println("result = " + result); //from result line16 anwer 11-1=10 showen in line20
        result = x;
        System.out.println("result = " + result);

    }
}
