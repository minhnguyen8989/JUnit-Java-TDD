import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student;

    @Before
    public void studentSetUp () {
        student = new Student("minh",777);

    }

    @Test
    public void testIfStudentNameIsString(){
        assertEquals("minh",student.getName());
    }

    @Test
    public void testIfStudentIDIsLong(){
        assertEquals(777,student.getId());
    }

}
