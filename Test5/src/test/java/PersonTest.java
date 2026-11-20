import com.bootcampexcercise.module9.activity.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        // TODO: Initialize person object
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
        // TODO: Tear down person object (set to null)
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        // TODO: Test setWeight/getWeight and setHeight/getHeight
        person.setWeight(76);
        person.setHeight(1.84f);

        assertEquals(76, person.getWeight());
        assertEquals(1.84f, person.getHeight(), 0.001f);
    }

    @Test
    public void testGetBodyMassIndex() {
        // TODO: Test valid BMI categories (Underweight, Normal weight, Overweight, Obese)
        assertEquals("Underweight", person.getBodyMassIndex(50, 1.75));
        assertEquals("Normal weight", person.getBodyMassIndex(70, 1.75));
        assertEquals("Overweight", person.getBodyMassIndex(85, 1.75));
        assertEquals("Obese", person.getBodyMassIndex(100, 1.75));

        // Boundaries between categories (height 2.0 gives BMI = weight / 4)
        assertEquals("Underweight", person.getBodyMassIndex(73, 2.0));    // BMI 18.25
        assertEquals("Normal weight", person.getBodyMassIndex(74, 2.0));  // BMI 18.5
        assertEquals("Normal weight", person.getBodyMassIndex(99, 2.0));  // BMI 24.75
        assertEquals("Overweight", person.getBodyMassIndex(100, 2.0));    // BMI 25.0
        assertEquals("Overweight", person.getBodyMassIndex(119, 2.0));    // BMI 29.75
        assertEquals("Obese", person.getBodyMassIndex(120, 2.0));         // BMI 30.0
        // TODO: Test invalid and boundary inputs (zero, negative values, > 600 weight, > 3.0 height)
        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(-5, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(601, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(70, -1.7));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 3.1));

        // Upper limits are still valid
        assertEquals("Obese", person.getBodyMassIndex(600, 1.75));
        assertEquals("Underweight", person.getBodyMassIndex(70, 3.0));

    }
}