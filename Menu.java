import java.util.List;
import java.util.Scanner;

public class Menu {

    void mainMenu(List<Course> courses, List<Student> students, List<Groupe> groupes, List<Teacher> teachers, List<Room> rooms, boolean running){
        while (running == true) {
            mainMenu_description();

            Scanner scanner = new Scanner(System.in);

            int selected = scanner.nextInt();

            switch (selected){
                case 0:
                    addCourse(courses);
                    break;
                case 1:
                    removeCourse(courses);
                    break;
                case 2:
                    addStudent(students);
                    break;
                case 3:
                    removeStudent(students);
                    break;
                case 4:
                    addTeacher(teachers);
                    break;
                case 5:
                    removeTeacher(teachers);
                    break;
                case 6:
                    addRoom(rooms);
                    break;
                case 7:
                    removeRoom(rooms);
                    break;
                case 8:
                    addStudentToCourse(courses, students);
                    break;
                case 9:
                    removeStudentfromCourse(courses);
                    break;
                case 10:
                    running = false;
                    System.out.println("Quiting program...");
                    break;
                default:
                    System.out.println("Not a valid option!");

            }
        }
    }

    private void mainMenu_description() {
        System.out.println("\n::::::::: Main menu ::::::::");
        System.out.println();
        System.out.println("0. Add course");
        System.out.println("1. Remove course");
        System.out.println("2. Add student");
        System.out.println("3. Remove student");
        System.out.println("4. Add teacher");
        System.out.println("5. Remove teacher");
        System.out.println("6. Add room");
        System.out.println("7. Remove room");
        System.out.println("8. Add student to course");
        System.out.println("9. Remove student from course");
        System.out.println("10. Quit");
    }

    void addCourse(List<Course> courses){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter course name:");
        String courseName = scanner.nextLine();
        System.out.println("Enter course type:");
        String courseType = scanner.nextLine();

        courses.add(new Course(courseName,courseType));
    }

    void removeCourse(List<Course> courses){

        Scanner scanner = new Scanner(System.in);

        int i = 0;

        for (Course c: courses) {
            System.out.println(i + ": " + c.getCourseName() + " - " + c.getCourseType());
            i++;
        }

        System.out.println("Enter course number:");
        int courseNumber = scanner.nextInt();

        courses.remove(courseNumber);
    }

    void addStudent(List<Student> students){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student first name:");
        String studentFirstName = scanner.nextLine();
        System.out.println("Enter student last name:");
        String studentLastName = scanner.nextLine();

        students.add(new Student(studentFirstName,studentLastName));
    }

    void removeStudent(List<Student> students){

        Scanner scanner = new Scanner(System.in);

        int i = 0;

        for (Student s: students) {
            System.out.println(i + ": " + s.getStudentFirstName() + " " + s.getStudentLastName());
            i++;
        }

        System.out.println("Enter student number:");
        int studentNumber = scanner.nextInt();

        students.remove(studentNumber);
    }

    void addTeacher(List<Teacher> teachers){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter teacher first name:");
        String teacherFirstName = scanner.nextLine();
        System.out.println("Enter teacher last name:");
        String teacherLastName = scanner.nextLine();

        teachers.add(new Teacher(teacherFirstName,teacherLastName));
    }

    void removeTeacher(List<Teacher> teachers){

        Scanner scanner = new Scanner(System.in);

        int i = 0;

        for (Teacher t: teachers) {
            System.out.println(i + ": " + t.getTeacherFirstName() + " " + t.getTeacherLastName());
            i++;
        }

        System.out.println("Enter teacher number:");
        int teacherNumber = scanner.nextInt();

        teachers.remove(teacherNumber);
    }
    void addRoom(List<Room> rooms){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter room number:");
        int roomNumber = scanner.nextInt();
        System.out.println("Enter room level:");
        int roomLevel = scanner.nextInt();

        rooms.add(new Room(roomNumber,roomLevel));
    }

    void removeRoom(List<Room> rooms){

        Scanner scanner = new Scanner(System.in);

        int i = 0;

        for (Room r: rooms) {
            System.out.println(i + " - Room number:" + r.getRoomNumber() + " Level:" + r.getRoomLevel());
            i++;
        }

        System.out.println("Enter number:");
        int roomNumber = scanner.nextInt();

        rooms.remove(roomNumber);
    }

    void addStudentToCourse(List<Course> courses, List<Student> students){
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        for (Course c: courses) {
            System.out.println(i + ": " + c.getCourseName() + " - " + c.getCourseType());
            i++;
        }

        System.out.println("Enter course number:");
        int courseNumber = scanner.nextInt();

        i = 0;

        for (Student s: students) {
            System.out.println(i + ": " + s.getStudentFirstName() + " " + s.getStudentLastName());
            i++;
        }

        System.out.println("Enter student number:");
        int studentNumber = scanner.nextInt();

        Student student = students.get(studentNumber);

        courses.get(courseNumber).addStudents(student);
    }

    void removeStudentfromCourse(List<Course> courses){
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        for (Course c: courses) {
            System.out.println(i + ": " + c.getCourseName() + " - " + c.getCourseType());
            i++;
        }

        System.out.println("Enter course number:");
        int courseNumber = scanner.nextInt();

        List<Student> students = courses.get(courseNumber).getStudents();

        i = 0;

        for (Student s: students) {
            System.out.println(i + ": " + s.getStudentFirstName() + " " + s.getStudentLastName());
            i++;
        }

        System.out.println("Enter student number:");
        int studentNumber = scanner.nextInt();

        courses.get(courseNumber).removeStudents(studentNumber);
    }
}
