public class Student {
    private String studentFirstName;
    private String StudentLastName;

    public Student(String studentFirstName, String studentLastName) {
        this.studentFirstName = studentFirstName;
        this.StudentLastName = studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return StudentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.StudentLastName = studentLastName;
    }
}
