package OOP.project_teacher;

public class testTeacherM {
    public static void main(String[] args) {
        teacherM teacher1 = new teacherM();   //object create
        teacher1.name = "Saad Abu Sami";
        teacher1.gender = "male";
        teacher1.phone_number = 8801400159183L;
        System.out.println("Name: " + teacher1.name);
        System.out.println("Gender: " + teacher1.gender);
        System.out.println("Phone: " + teacher1.phone_number);

        teacherM teacher2 = new teacherM();   //object create
        teacher2.name = "Mohammad Sami";
        teacher2.gender = "male";
        teacher2.phone_number = 8801455956184L;
        System.out.println("Name: " + teacher2.name);
        System.out.println("Gender: " + teacher2.gender);
        System.out.println("Phone: " + teacher2.phone_number);
    }
}
