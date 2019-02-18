import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseType;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName, String courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }

    public void removeStudents(int studentNumber) {
        this.students.remove(studentNumber);
    }
}
