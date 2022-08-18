import java.util.Date;

public class Student {
    int no;
    String name;
    int year;
    Date dob;
    String major;

    Student(int no, String name, int year, Date dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }

    void study() {

    }

    void register(){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
