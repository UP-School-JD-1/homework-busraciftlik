import java.util.Date;

public class GraduateStudent extends Student {

    String advisor;
    String thesis;

    GraduateStudent(int no, String name, int year, Date dob, String major , String advisor , String thesis) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    void study() {
        System.out.println("Graduated");

    }

    @Override
    void register() {
        System.out.println("graduation ceremony");
    }

    void writeThesis(){

    }

    void meetWithAdvisor(){

    }
}
