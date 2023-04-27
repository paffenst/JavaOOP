package de.neuefische;

import java.rmi.NoSuchObjectException;
import java.util.*;

import de.neuefische.model.Student;

public class StudentDB {
    private Map<String, Student> studentsMap = new HashMap<>();

    public StudentDB(Map<String, Student> studentsMap) {
        this.studentsMap = studentsMap;
    }

    public Map<String, Student> getStudentsMap() {
        return studentsMap;
    }

    public void setStudentsMap(Map<String, Student> studentsMap) {
        this.studentsMap = studentsMap;
    }

    public Student addStudent(Student student) {
        studentsMap.put(student.getId(), student);
        return studentsMap.get(student.getId());
    }
    public Student getStudentById(String id) throws StudentNotFoundException {
        if (studentsMap.containsKey(id)) {
            return studentsMap.get(id);
        } else {
            throw new StudentNotFoundException("Student with id" + id + " not found");
        }
    }
    public Student removeStudent(Student exStudent) {
        studentsMap.get(exStudent.getId());
        return studentsMap.remove(exStudent.getId());
    }

    public Student findById(String id) throws NoSuchObjectException {
        if (this.studentsMap.containsKey(id)) {
            return this.studentsMap.get(id);
        } else {
            throw new NoSuchObjectException("Student not found");
        }
    }
}
