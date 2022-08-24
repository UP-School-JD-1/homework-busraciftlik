import java.util.Date;

public class UndergraduateStudent extends Student{
    String minor;

    UndergraduateStudent(int no, String name, int year, Date dob, String major , String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }

    @Override
    void study() {
        System.out.println("Study hard");
    }

    @Override
    void register() {
        System.out.println("register for lessons");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
