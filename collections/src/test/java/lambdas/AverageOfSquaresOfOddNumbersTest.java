package lambdas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageOfSquaresOfOddNumbersTest {

    @Test
    public void testAverageWithOddNumbers() {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result = AverageOfSquaresOfOddNumbers.averageOfSquaresOfOddNumbers(inputArray);
        assertEquals(29.0, result, 0.01);
    }

    @Test
    public void testAverageWithNoOddNumbers() {
        int[] inputArray = {2, 4, 6, 8, 10};
        double result = AverageOfSquaresOfOddNumbers.averageOfSquaresOfOddNumbers(inputArray);
        assertEquals(0.0, result, 0.01);
    }

    @Test
    public void testAverageWithEmptyArray() {
        int[] inputArray = {};
        double result = AverageOfSquaresOfOddNumbers.averageOfSquaresOfOddNumbers(inputArray);
        assertEquals(0.0, result, 0.01);
    }

    @Test
    public void testAverageWithNegativeOddNumbers() {
        int[] inputArray = {-3, -5, -7, -9, -11};
        double result = AverageOfSquaresOfOddNumbers.averageOfSquaresOfOddNumbers(inputArray);
        assertEquals(84.0, result, 0.01);
    }
}