package de.neuefische.model;
import java.lang.*;
import java.util.Objects;

public class Student {
    private int studentNr;
    private String name;
    private String city;
    private String adress;
    private int cardNr;
    private int id;


    public Student(String name,String adress,int cardNr, String city ,int studentNr,int id) {
        this.city = city;
        this.name = name;
        this.adress = adress;
        this.cardNr = cardNr;
        this.studentNr = studentNr;
        this.id = id;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCardNr(int cardNr) {
        this.cardNr = cardNr;
    }

    public String getAdress() {
        return adress;
    }

    public int getCardNr() {
        return cardNr;
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

    @Override
    public String toString() {
        return "Student{" +
                "studentNr=" + studentNr +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", adress='" + adress + '\'' +
                ", cardNr=" + cardNr +
                ", id=" + id +
                '}';
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