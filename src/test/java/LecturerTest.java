import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LecturerTest {
    private Lecturer lecturer;

    @BeforeEach
    void setUp(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2001, 9, 21);
        lecturer = new Lecturer(19482022, "John", 21, calendar.getTime());
    }

    @Test
    @DisplayName("Test getUsername for Lecturer")
    void testGetUsername(){
        assertEquals("John21", lecturer.getUsername());
    }
}
