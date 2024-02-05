package lambdas;

public class AverageOfSquaresOfOddNumbers {

    public static double averageOfSquaresOfOddNumbers(int[] numbers) {
        int sumOfSquares = 0;
        int countOfOddNumbers = 0;

        for (int num : numbers) {
            if (num % 2 != 0) {  // Check if the number is odd
                sumOfSquares += num * num;
                countOfOddNumbers++;
            }
        }

        // Avoid division by zero
        return (countOfOddNumbers == 0) ? 0 : (double) sumOfSquares / countOfOddNumbers;
    }
}
