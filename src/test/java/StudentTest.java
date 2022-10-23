import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTest {

    Student student;

    @BeforeEach
    void setUp(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2001, 9, 21);
        student = new Student(19482022, "Yousaf", 21, calendar.getTime());
    }
//
    @Test
    @DisplayName("Test getUsername for Student")
    void testGetUsername(){
        assertEquals("Yousaf21", student.getUsername());
    }
}
