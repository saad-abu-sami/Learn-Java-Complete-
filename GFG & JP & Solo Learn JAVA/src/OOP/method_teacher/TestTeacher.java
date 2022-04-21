package OOP.method_teacher;
import OOP.project_teacher.teacher;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();   //object create
        teacher1.name1 = "Saad Abu Sami";
        teacher1.gender = "male";
        teacher1.phone_number = 8801400159183L;
        System.out.println("Name: " +teacher1.name1);
        System.out.println("Gender: "+teacher1.gender);
        System.out.println("Phone: "+teacher1.phone_number);

        Teacher teacher2 = new Teacher();   //object create
        teacher2.name1 = "Mohammad Sami";
        teacher2.gender = "male";
        teacher2.phone_number =  8801455956183L;
        System.out.println("Name: " +teacher2.name1);
        System.out.println("Gender: "+teacher2.gender);
        System.out.println("Phone: "+teacher2.phone_number);
    }
}
