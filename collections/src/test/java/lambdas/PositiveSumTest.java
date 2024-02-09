package lambdas;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PositiveSumTest {
    @Test
    public void validTest(){
        Assert.assertEquals(6, PositiveSum.printSum(List.of(1,2,3,-1,-2)));
        Assert.assertEquals(0, PositiveSum.printSum(List.of(-1,-2,-3)));
    }
}
