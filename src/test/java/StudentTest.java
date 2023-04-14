import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student;

    @Before
    public void studentSetUp () {
        student = new Student("minh",888);
    }

    @Test
    public void testConstructor() {
        assertEquals("minh", student.getName());
        assertEquals(888, student.getId());
        assertEquals(0, student.getGrades().size());
    }

    @Test
    public void testAddGrade() {
        student.addGrade(85);
        student.addGrade(95);
        assertEquals(2, student.getGrades().size());
        assertEquals(85, (int) student.getGrades().get(0));
        assertEquals(95, (int) student.getGrades().get(1));
    }

    @Test
    public void testGetGradeAverage() {
        student.addGrade(83);
        student.addGrade(90);
        student.addGrade(93);
        assertEquals(88, student.getGradeAverage(), 0.7);
    }

    @Test
    public void testUpdateGrade(){
        student.addGrade(83);
        student.addGrade(90);
        student.addGrade(93);
        student.updateGrade(0,90);
        student.updateGrade(2,90);
        assertEquals(90, student.getGradeAverage(),0.1);
    }

    @Test
    public void testDeleteGrade(){
        student.addGrade(83);
        student.addGrade(90);
        student.addGrade(100);
        student.deleteGrade(0);
        assertEquals(95, student.getGradeAverage(), 0);
    }
}
