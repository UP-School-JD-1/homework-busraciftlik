import java.util.Date;

public class MasterStudent extends GraduateStudent{

    MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, double undergraduateGraduationGrade) {
        super(no, name, year, dob, major, advisor, thesis,undergraduateGraduationGrade);
    }

    @Override
    void study() {
        System.out.println("Master student is studying.");
    }

    @Override
    void writeThesis() {
        System.out.println("writing master thesis");
    }

    @Override
    public String toString() {
        return "MasterStudent{}";
    }
}
