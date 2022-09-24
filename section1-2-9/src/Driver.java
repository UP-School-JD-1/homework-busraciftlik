import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        RegistrationOffice registrationOffice = new RegistrationOffice();
        Student student = new PhdStudent(1006, "Büşra", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", false, 3.5);
        Student student2 = new MasterStudent(1007, "İkram", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", 3.5);
        registrationOffice.registerStudent(student);
        registrationOffice.registerStudent(student2);

        System.out.println("Student count: " + registrationOffice.getStudentCount());

        Student foundStudent = registrationOffice.getStudentByNo(1006);
        System.out.println(foundStudent.name);

        ArrayList<Student> students = createStudentList();
        for(Student st : students) {
            System.out.println(st.name+" : " + st.no);
        }
        //students.add(new PhdStudent(1006, "Büşra", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", false, 3.5));
        //students.add(new MasterStudent(1007, "İkram", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", 3.5));


        //Collections.sort(students);
        students.sort(new StudentComparator());

        System.out.println("\n Ordering students by no\n");
        for(Student st : students) {
            System.out.println(st.name+" : " + st.no);
        }


    }

    public static ArrayList<Student> createStudentList() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new PhdStudent(12, "Büşra", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", false, 3.5));
        students.add(new PhdStudent(6754, "Elif", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", false, 3.5));
        students.add(new PhdStudent(45445, "Gamze", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", false, 3.5));
        students.add(new PhdStudent(10442, "Mehmet", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", false, 3.5));
        students.add(new PhdStudent(5678, "Alican", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", false, 3.5));
        students.add(new PhdStudent(876, "Faruk", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", false, 3.5));
        students.add(new PhdStudent(658, "Gizem", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", false, 3.5));
        students.add(new MasterStudent(547853, "İkram", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", 3.5));
        students.add(new MasterStudent(23567, "Oğuzhan", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", 3.5));
        students.add(new MasterStudent(35789, "Hacı", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", 3.5));
        students.add(new MasterStudent(6564, "Berra", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", 3.5));
        students.add(new MasterStudent(89765, "Öznur", 2019, new Date(1996, 1, 2), "major", "Ayşe", "software", 3.5));

        return students;
    }

}
