package de.neuefische;
import java.util.*;
import de.neuefische.model.Student;

public class StudentDB {
   // private Student[] students;
    List<Student> students;
    public StudentDB(Student[] students) {
        this.students = Arrays.asList(students);
    }

    public Student[] getAllStudents(){
        return this.students.toArray(new Student[students.size()]); // ArrayList in A
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public Student randomStudent(){
        Random rng = new Random();
        rng.nextInt(students.size());
    //    int random = (int) (Math.random()*students.length);
    //    return students[random];
        return students.get(rng.nextInt(students.size()));
    }

    public Student[] addStudent(Student newStudent){
    students.add(newStudent);
    return this.students.toArray(new Student[students.size()]);
    }

    public Student[] removeStudent(Student exStudent){
        students.remove(exStudent);
        return this.students.toArray(new Student[students.size()]);
    }
}
