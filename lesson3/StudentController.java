import java.util.List;

public class StudentController {
    private StreamService streamService;

    public StudentController() {
        this.streamService = new StreamService();
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}
