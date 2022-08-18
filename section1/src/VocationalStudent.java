import java.util.Date;

public class VocationalStudent extends Student{

    VocationalStudent(int no, String name, int year, Date dob, String major) {
        super(no, name, year, dob, major);
    }

    @Override
    void study() {
        super.study();
    }

    @Override
    void register() {
        super.register();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
