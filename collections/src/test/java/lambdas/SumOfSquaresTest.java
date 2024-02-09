package lambdas;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SumOfSquaresTest {
    @Test
    public void SumOfSquaresTestValid(){
        Assert.assertEquals(35,SumOfSqaures.sumOfOdd(new int[]{1,3,5}));
        Assert.assertEquals(0,SumOfSqaures.sumOfOdd(new int[]{2,4,6}));
        Assert.assertEquals(0,SumOfSqaures.sumOfOdd(new int[]{-2,4,6}));
        Assert.assertEquals(35,SumOfSqaures.sumOfOdd(new int[]{-1,-3,-5}));

    }
}
