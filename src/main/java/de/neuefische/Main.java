package de.neuefische;

import de.neuefische.model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Student s1 = new Student("1","Anna","Hauptstraße 1",123212, PartyInviteStatus.INVITED);
        Student s2 = new Student("2","Hana","Hauptstraße 23",132123,PartyInviteStatus.INVITED_ACCEPTED);
        Student s3 = new Student("3","Adam","Bonnerstraße 44",432134,PartyInviteStatus.INVITED_ACCEPTED);
        Student s4 = new Student("4","Musa","Bonnerstraße 44",432134,PartyInviteStatus.INVITED_ACCEPTED);

        BiologyStudent bst1 = new BiologyStudent("5","IVON","Flotowstr.1",82171,PartyInviteStatus.INVITED_ACCEPTED,true);
        ComputerScienceStudent com1 = new ComputerScienceStudent("6","Darko","Boschstr.20",3123123,PartyInviteStatus.NOT_INVITED,"Java");
        Map<String, Student> students = new HashMap<>() {{
            put("1",s1);
            put("2",s2);
            put("3",s3);
        }};

        StudentDB stDB = new StudentDB(students);
        System.out.println(students);
        stDB.addStudent(bst1);
        stDB.addStudent(com1);
        System.out.println(students);
        stDB.removeStudent(com1);
        System.out.println(students);

        try {
            System.out.println(stDB.getStudentById("7"));
        } catch (StudentNotFoundException e) {
            System.out.println("Hups, eine Exception!");
        }
    }
}
