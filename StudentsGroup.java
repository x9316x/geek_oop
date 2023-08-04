import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private List<Student> students;
    public StudentsGroup() {
        students = new ArrayList<>();
    }

    public StudentsGroup(List<Student> students) {
        setStudents(students);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "students=" + students +
                '}';
    }
}
