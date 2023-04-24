package de.neuefische;

import de.neuefische.model.Student;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Aida", "Bonn", 911911911,1);
        Student student1 = new Student("Hans", "Kaiserslautern", 12121311,2);

        Student st = new Student("Aida", "Bonn", 911911911,1);
        Student st1 = new Student("Hana", "Kiel", 12129822,2);
        Student st3 = new Student("Thomas", "Bonn", 345432231,3);
        Student st4 = new Student("Otto", "Flensburg", 982912312,4);
       // System.out.println(student);
       // System.out.println(student1);
       // System.out.println(Objects.equals(student.studentNr, student1.studentNr));

        StudentDB db;
        db = new StudentDB(new Student[] {st1,st,st3,st4});

        System.out.println("LIST");
        System.out.println(db);
        System.out.println(Arrays.toString(db.getAllStudents()));
        System.out.println("Random student: " + db.randomStudent());
        System.out.println("Remove a student");
        db.removeStudent(st1);
        System.out.println(db);
        System.out.println("Add a student");
        db.addStudent(st4);
        System.out.println(db);

    }
}
