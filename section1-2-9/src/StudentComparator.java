import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.no < o2.no) {
            return -1;
        } else if (o1.no == o2.no) {
            return 0;
        } else {
            return 1;
        }
    }
}
