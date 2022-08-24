import java.util.Date;

public class MasterStudent extends GraduateStudent{

    MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
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
    void writeThesis() {
        super.writeThesis();
    }

    @Override
    void meetWithAdvisor() {
        super.meetWithAdvisor();
    }
}
