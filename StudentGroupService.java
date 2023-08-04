import java.util.List;

public class StudentGroupService {

    private StudentsGroup studentsGroup;

    public StudentGroupService(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public StudentGroupService() {
        this.studentsGroup = new StudentsGroup();
    }

    public StudentsGroup gStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }


    public boolean removeStudent(String firstName, String secondName, String lastName) {
        Student removStudent = new Student(null, firstName, secondName, lastName);
        if (studentsGroup.getStudents() == null) return false;
        List<Student> studentsList = studentsGroup.getStudents();
        for (Student student: studentsList) {
            if (student.equals(removStudent)) {
                studentsList.remove(student);
                return true;
            }
        }
        return false;
    }
}
