import org.joda.time.DateTime;

import java.util.List;


public class Course {
    private String name;
    private List<SubjectModule> subjectModules;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addModule(SubjectModule subjectModule){
        subjectModules.add(subjectModule);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", modules=" + subjectModules +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

