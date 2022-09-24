public class RegistrationOffice {

    private Student[] students;
    private int lastIndex;

    public RegistrationOffice() {
        students = new Student[150];
        lastIndex = 0;
    }

    Student getStudentByNo(int studentNo) {
        for (int i = 0; i < lastIndex; i++) {
            Student foundStudent = students[i];
            if(studentNo == foundStudent.no){
                return foundStudent;
            }
        }
        System.out.println("student not found");
        return null;
    }

    void registerStudent(Student student) {
        students[lastIndex]=student;
        lastIndex++;

    }

    int getStudentCount(){

        return lastIndex;
    }
}
