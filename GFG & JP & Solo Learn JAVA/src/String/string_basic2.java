package String;
import java.util.*;
public class string_basic2 {
    public static void main(String[] args) {
        String s1 = "SAAD ABU SAMI"; String s2 = "Saad Abu Sami"; String s3 = "";
        boolean con1 = s1.contains("Sami");
        System.out.println(con1);
        boolean con2 = s3.isEmpty();
        System.out.println(con2);
        boolean con3 = s1.startsWith("s");
        System.out.println("First word on s1 : "+con3); //s lower case is not available in s1
        boolean con4 = s1.startsWith("S");
        System.out.println("First word on s1 : "+con4); //S Upper case is available in s1
        boolean con5 = s1.startsWith("SAA");
        System.out.println("First word on s1 : "+con5); //SAA Upper case is available in s1
        boolean con6 = s1.endsWith("i");
        System.out.println("Last word on s1 : "+con6); //i lower case is not available in s1
        boolean con7 = s1.endsWith("I");
        System.out.println("Last word on s1 : "+con7); //I Upper case is available in s1
        boolean con8 = s1.endsWith("AMI");
        System.out.println("Last word on s1 : "+con8); //AMI Upper case is available in s1

    }
}
