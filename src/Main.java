
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Teacher Juha = new Teacher(1,"Juha",4300);
        Teacher Kari = new Teacher(2,"Kari",5000);
        Teacher Amir = new Teacher(3,"Amir",4500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Juha);
        teacherList.add(Kari);
        teacherList.add(Amir);

        Student Lam = new Student(1,"Lam",5);
        Student Niko = new Student(2,"Niko",2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Lam);
        studentList.add(Niko);

        School Haaga = new School(teacherList,studentList);
        Lam.payFees(500);

        System.out.println(Lam.getRemainingFees());
    }
}
