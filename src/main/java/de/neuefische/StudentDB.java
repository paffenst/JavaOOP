package de.neuefische;
import java.util.*;
import de.neuefische.model.Student;

public class StudentDB {
    private Student[] students;
    public StudentDB(Student[] students) {
        this.students = students;
    }
    public Student[] getAllStudents(){
        return students;
    }
    public String toString(){
        return Arrays.toString(students);
    }

    public Student randomStudent(){
        int random = (int) (Math.random()*students.length);
        return students[random];
    }

    public void addStudent(Student newStudent){
      students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = newStudent;
    }

    public void removeStudent(Student exStudent){
        Student[] newStudents = new Student[students.length -1];
        int diff = 0;
        for(int i=0; i<students.length;i++){
            if(!students[i].equals(exStudent)){
                newStudents[i-diff] = students[i];
            } else {
                diff++;
            }
        }
        students = newStudents;
    }
}
