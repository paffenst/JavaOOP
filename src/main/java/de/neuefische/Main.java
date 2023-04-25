package de.neuefische;

import de.neuefische.model.BiologyStudent;
import de.neuefische.model.ComputerScienceStudent;
import de.neuefische.model.Student;

import java.util.*;
import de.neuefische.model.Student;
public class Main {
    public static void main(String[] args) {

//        Student student = new Student("Aida", "Bonn", 911911911,1);
//        Student student1 = new Student("Hans", "Kaiserslautern", 12121311,2);

        Student st = new Student("Aida", "Hauptstr.1",121212,"Bonn", 911911911,1);
        Student st1 = new Student("Hana","Hauptstr.2" ,121212,"Kiel", 12129822,2);
        Student st3 = new Student("Thomas","Hauptstr.3" ,12121212,"Bonn",345432231,3);
        Student st4 = new Student("Otto", "Hauptstr.22",12123112,"Flensburg" ,982912312,4);
        BiologyStudent bioStudent = new BiologyStudent("Otto","Flotowstr.2",123413,"Bonn",911911,1,true);
        ComputerScienceStudent comStudent = new ComputerScienceStudent("Marco","Belineralle.100",342123,"Kiel",123454,2,"Java");


        System.out.println(bioStudent.toString());
        System.out.println(comStudent.toString());

    }
}
