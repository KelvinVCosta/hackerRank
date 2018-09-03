package edu.practice.java.strings;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Kelvin
 */
public class UsernameRegexTest {

    public UsernameRegexTest() {
    }

    @Test
    public void testMain() throws IOException {
        String lineBreaker = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        sb
                .append("Invalid").append(lineBreaker)
                .append("Valid").append(lineBreaker)
                .append("Valid").append(lineBreaker)
                .append("Invalid").append(lineBreaker)
                .append("Invalid").append(lineBreaker)
                .append("Valid").append(lineBreaker)
                .append("Invalid").append(lineBreaker)
                .append("Invalid").append(lineBreaker);
        String expected = sb.toString();

        String[] args = null;
        final InputStream original = System.in;
        File input = new File("test/resources/UsernameRegexTestInput.txt");
        final FileInputStream fips = new FileInputStream(input);

        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        System.setIn(fips);
        UsernameRegex.main(args);
        System.setIn(original);

        String actual = os.toString();
        
        assertEquals(expected, actual);
    }

}
