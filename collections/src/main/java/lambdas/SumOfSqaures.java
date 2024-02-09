package lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfSqaures{
    public static int sumOfOdd(int [] inputArray){
       return Arrays.stream(inputArray).filter(n->n%2!=0)
                .map(n->n*n).sum();

    }
}
