import java.util.Date;

public class UndergraduateStudent extends Student{
    String minor;

    UndergraduateStudent(int no, String name, int year, Date dob, String major , String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }
}
