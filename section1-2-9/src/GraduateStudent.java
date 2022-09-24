import java.util.Date;

public abstract class GraduateStudent extends Student {

    String advisor;
    String thesis;
    double undergraduateGraduationGrade;

    GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, double undergraduateGraduationGrade) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
        this.undergraduateGraduationGrade = undergraduateGraduationGrade;
    }

    @Override
    void register() {
        if(undergraduateGraduationGrade >= 2.50){
            System.out.println("Successfully register");
        }else{
            System.out.println("Graduation grade is not sufficient for register ");
        }
    }

   abstract void writeThesis();

    void meetWithAdvisor() {
        System.out.println("Meeting with advisor");
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "advisor='" + advisor + '\'' +
                ", thesis='" + thesis + '\'' +
                ", undergraduateGraduationGrade=" + undergraduateGraduationGrade +
                '}';
    }
}
