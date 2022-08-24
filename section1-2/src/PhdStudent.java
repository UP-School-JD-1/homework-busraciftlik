import java.util.Date;

public class PhdStudent extends GraduateStudent{
    boolean qualifyingExamTaken ;

    PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis , boolean qualifyingExamTaken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
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

    void writePaper(){

    }
}
