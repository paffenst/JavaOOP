import de.neuefische.StudentDB;
import de.neuefische.model.Student;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class StudentTest{

    @Test
    void getAllStudents_shouldReturn_4Students() {
        //Given
        Student st = new Student("Aida", "Bonn", 911911911,1);
        Student st1 = new Student("Hana", "Kiel", 12129822,2);
        Student st3 = new Student("Thomas", "Bonn", 345432231,3);
        Student st4 = new Student("Otto", "Flensburg", 982912312,4);
        Student[] students = {st1,st,st3,st4};

        StudentDB db = new StudentDB(students);
        //When
        Student[] actual = db.getAllStudents();
        //Then
        //Spezielle Testmethode um Arrays auf Gleichheit zu testen
        assertArrayEquals(students,actual);
    }

}