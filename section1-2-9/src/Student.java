import java.lang.Comparable;

import java.util.Date;

public abstract class Student implements Comparable<Student> {
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

    abstract void study();

    abstract void register();

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student student){
        if (student.no < this.no) {
            return 1;
        } else if (student.no == this.no) {
            return 0;
        } else {
            return -1;
        }
    }
}
