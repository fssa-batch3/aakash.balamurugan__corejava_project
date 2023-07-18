package day08.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Practice1Test {

    @Test
    public void testCountOccurrences() {
        // Redirect standard output to capture printed content
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Test input
        String[] arr = {"Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider"};

        // Expected output
        String expectedOutput = "Ram 2\nSuperman 1\nspider 1\nhey 2\nhello 1\nSpider 1\n";

        // Call the method to be tested
        Practice1.countOccurrences(arr);

        // Get the printed output
        String actualOutput = outputStream.toString();

        // Reset standard output
        System.setOut(System.out);

        // Assert the expected and actual outputs
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
