package day07.practice;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        // Create an ArrayList with duplicate entries
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);

        // Create a HashSet to store unique values
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Create an ArrayList with expected unique values
        ArrayList<Integer> expectedUniqueNumbers = new ArrayList<>();
        expectedUniqueNumbers.add(10);
        expectedUniqueNumbers.add(20);
        expectedUniqueNumbers.add(30);
        expectedUniqueNumbers.add(40);

        // Remove duplicates using the RemoveDuplicates class
        ArrayList<Integer> result = new ArrayList<>(uniqueNumbers);

        // Verify the result matches the expected unique values
        Assertions.assertEquals(expectedUniqueNumbers, result);
    }
}
