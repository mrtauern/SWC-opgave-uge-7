

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kursus-administration\n");

        Menu menu = new Menu();

        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Groupe> groupes = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Room> rooms = new ArrayList<>();
        boolean running = true;

        courses.add(new Course("SWC","Programmering"));
        courses.add(new Course("SWD","Design"));
        courses.add(new Course("ITO","Virksomheden"));
        courses.add(new Course("Tech","teknologi"));

        students.add(new Student("Peter","Poulsen"));
        students.add(new Student("Erik","Hansen"));
        students.add(new Student("Sanne","Svendsen"));
        students.add(new Student("Güstav","*Porresen"));

        teachers.add(new Teacher("Ole","Hansen"));
        teachers.add(new Teacher("Janni","Jannisen"));
        teachers.add(new Teacher("Søren","Iversen"));

        rooms.add(new Room(101,1));
        rooms.add(new Room(077,0));
        rooms.add(new Room(220,2));

        menu.mainMenu(courses, students, groupes, teachers, rooms, running);
    }
}
