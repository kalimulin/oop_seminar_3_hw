import java.util.List;

public class Controller {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();

    public void RemoveStudentByFio(String firstName, String lastName, String middleName) {
        studentGroupService.RemoveStudentByFio(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFio() {
        return studentGroupService.getSortedStudentsByFio();
    }

    public List<Stream> getSortedStreams() {
        return streamService.getSortedStreamList();
    }
}