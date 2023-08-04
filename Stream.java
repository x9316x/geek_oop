import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentsGroup> {
    private List<StudentsGroup> studentsGroups;

    public Stream(List<StudentsGroup> studentsGroups) {
        this.studentsGroups = studentsGroups;
    }

    public List<StudentsGroup> getStudentsGroups() {
        return studentsGroups;
    }

    @Override
    public Iterator<StudentsGroup> iterator() {
        return studentsGroups.iterator();
    }
}
