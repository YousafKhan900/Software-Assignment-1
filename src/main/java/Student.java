import java.util.Date;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private int age;
    private Date dob;
    private String username;
    private List<Course> courses;
    private List<SubjectModule> subjectModules;

    public Student(int id, String name, int age, Date dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.username = name+age;
    }

    public int getId() {
        return id;
    }

    public Date getDob() {
        return dob;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<SubjectModule> getSubjectModules() {
        return subjectModules;
    }

    public String getUsername() {
        return username;
    }

    public void addModule(SubjectModule subjectModule){
        subjectModules.add(subjectModule);
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", username='" + username + '\'' +
                ", courses=" + courses +
                ", modules=" + subjectModules +
                '}';
    }
}