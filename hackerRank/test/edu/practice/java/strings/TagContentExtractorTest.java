package edu.practice.java.strings;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Kelvin
 */
public class TagContentExtractorTest {

    OutputStream os;
    PrintStream ps;

    @Before
    public void setUp() {
        os = new ByteArrayOutputStream();
        ps = new PrintStream(os);
        System.setOut(ps);
    }

    @Test
    public void testMain() throws IOException {
        String lineBreaker = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        sb.append("Start").append(lineBreaker);
        sb.append("Nayeem loves counseling").append(lineBreaker);
        sb.append("Sanjay has no watch").append(lineBreaker);
        sb.append("So wait for a while").append(lineBreaker);
        sb.append("None").append(lineBreaker);
        sb.append("Imtiaz has a secret crush").append(lineBreaker);
        sb.append("End").append(lineBreaker);
        String expected = sb.toString();

        File input = new File("test/resources/TagContentExtractorTestInput.txt");
        final FileInputStream fips = new FileInputStream(input);
        System.setIn(fips);

        TagContentExtractor.main(null);

        String actual = os.toString();

        assertEquals(expected, actual);
    }

}
