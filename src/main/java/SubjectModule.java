import java.util.List;

public class SubjectModule {
    private String name;
    private int id;
    private List<Student> students;
    private List<Course> courses;
    private Lecturer lecturer;


    public SubjectModule(String name, int id, Lecturer lecturer) {
        this.name = name;
        this.id = id;
        this.lecturer = lecturer;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addCourse(Course course){
        courses.add(course);
    }
}
