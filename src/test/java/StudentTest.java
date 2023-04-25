import de.neuefische.StudentDB;
import de.neuefische.model.BiologyStudent;
import de.neuefische.model.ComputerScienceStudent;
import de.neuefische.model.Student;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest{

    @Test
    void getAllStudents_shouldReturn_4Students() {
        //Given
       Student st = new Student("Aida","Hauptstr.1", 121212,"Bonn", 911911911,1);
        Student st1 = new Student("Hana","Hauptstr.2", 121212,"Kiel", 12129822,2);
        Student st3 = new Student("Thomas","Hauptstr.3",12121212,"Bonn", 345432231,3);
        Student st4 = new Student("Otto", "Hauptstr.22",12123112,"Flensburg", 982912312,4);

        Student[] students = {st1,st,st3,st4};

        StudentDB db = new StudentDB(students);
        //When
        Student[] actual = db.getAllStudents();
        //Then
        assertArrayEquals(students,actual);
    }

    @Test
    void returnString_ToGetAdress(){
        //given
        ComputerScienceStudent comStudent = new ComputerScienceStudent("Marco","Belineralle.100",342123,"Kiel",123454,2,"Java");
        String expected = "Belineralle.100";
        //when
        String actual = comStudent.getAdress();
        //then
        assertEquals(expected,actual);
    }
    @Test
    void returnID_ToGetCardNr(){
        //given
        BiologyStudent bioStudent = new BiologyStudent("Otto","Flotowstr.2",123413,"Bonn",911911,1,true);
        int expected = 123413;
        //when
        int actual = bioStudent.getCardNr();
        //then
        assertEquals(expected,actual);
    }

}