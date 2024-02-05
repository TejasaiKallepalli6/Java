package lambdas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelCountTest {

    @Test
    void testContainsVowels() {
        assertTrue(VowelCount.containsVowels("apple"));
        assertTrue(VowelCount.containsVowels("banana"));
        assertTrue(VowelCount.containsVowels("orange"));
        assertFalse(VowelCount.containsVowels("grape"));
        assertTrue(VowelCount.containsVowels("kiwi"));
        assertFalse(VowelCount.containsVowels("xyz"));
    }

    @Test
    void testCountVowels() {
        assertEquals(2, VowelCount.countVowels("apple"));
        assertEquals(3, VowelCount.countVowels("banana"));
        assertEquals(3, VowelCount.countVowels("orange"));
        assertEquals(2, VowelCount.countVowels("grape"));
        assertEquals(2, VowelCount.countVowels("kiwi"));
        assertEquals(0, VowelCount.countVowels("xyz"));
    }

    @Test
    void testPrintStringsWithVowelCount() {
        String[] strings = {"apple", "banana", "orange", "grape", "kiwi", "xyz"};
        VowelCount.printStringsWithVowelCount(strings);
        // You can manually verify the output as JUnit doesn't capture console output.
    }
}