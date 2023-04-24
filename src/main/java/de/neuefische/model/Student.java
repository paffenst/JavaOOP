package de.neuefische.model;

import java.lang.*;
import java.util.Objects;

public class Student {
    public int studentNr;
    public String name;
    public String city;
    private int id;


    public Student(String name, String city, int studentNr,int id) {
        this.city = city;
        this.name = name;
        this.studentNr = studentNr;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {}

    public int getStudentNr() {
        return studentNr;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setStudentNr(int studentNr) {
        this.studentNr = studentNr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "The name of the student is " +
                this.name + ", he lives is " +
                this.city + " and his student-number is " +
                this.studentNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentNr() == student.getStudentNr() && getId() == student.getId() && Objects.equals(getName(), student.getName()) && Objects.equals(getCity(), student.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentNr(), getName(), getCity(), getId());
    }
}