package OOP.project_teacher;
import java.util.*;
public class testTeacher {
    public static void main(String[] args) {
        teacher teacher1 = new teacher();   //object create
        teacher1.name = "Saad Abu Sami";
        teacher1.gender = "male";
        teacher1.phone_number = 8801400159183L;
        System.out.println("Name: " +teacher1.name);
        System.out.println("Gender: "+teacher1.gender);
        System.out.println("Phone: "+teacher1.phone_number);

        teacher teacher2 = new teacher();   //object create
        teacher2.name = "Mohammad Sami";
        teacher2.gender = "male";
        teacher2.phone_number =  8801455956183L;
        System.out.println("Name: " +teacher2.name);
        System.out.println("Gender: "+teacher2.gender);
        System.out.println("Phone: "+teacher2.phone_number);
    }
}
