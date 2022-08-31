import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        RegistrationOffice registrationOffice = new RegistrationOffice();
        Student student = new PhdStudent(1006,"Büşra",2019,new Date(1996,1,2),"major","Ayşe","software",false,3.5);
        Student student2 = new MasterStudent(1007,"İkram",2019,new Date(1996,1,2),"major","Ayşe","software",3.5);
        registrationOffice.registerStudent(student);
        registrationOffice.registerStudent(student2);

        System.out.println("Student count: "+ registrationOffice.getStudentCount());

        Student foundStudent = registrationOffice.getStudentByNo(1006);
        System.out.println(foundStudent.name);

    }
}
