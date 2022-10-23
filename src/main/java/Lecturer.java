import java.util.Date;
import java.util.List;

public class Lecturer {

    private int id;
    private String name;
    private int age;
    private Date dob;
    private String username;
    private List<SubjectModule> subjectModules;

    public Lecturer(int id, String name, int age, Date dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.username = name+age;
    }

    public void addModule(SubjectModule subjectModule){
        subjectModules.add(subjectModule);
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public Date getDob() {
        return dob;
    }

    public List<SubjectModule> getSubjectModules() {
        return subjectModules;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", username='" + username + '\'' +
                ", modules=" + subjectModules +
                '}';
    }
}
