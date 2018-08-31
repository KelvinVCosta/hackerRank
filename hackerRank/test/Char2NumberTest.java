
import edu.challenge.Char2Number;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Kelvin
 */
public class Char2NumberTest {

    public Char2NumberTest() {
    }

    @Test
    public void testEncodeString() {
        String strTest = "The sunset sets at twelve o' clock.";
        String expectedResult = "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11";

        Char2Number tester = new Char2Number();
        String actual = tester.encodeString(strTest);

        assertEquals(expectedResult, actual);
    }

}
