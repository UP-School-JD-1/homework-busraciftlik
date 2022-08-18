import java.util.Date;

public class GraduateStudent extends Student{

    String advisor;
    String thesis;

    GraduateStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }
}
