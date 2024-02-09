package additionalcodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class repeatDigitsTest {
    @Test
    public void repeatDigitTest()
    {
        Assert.assertEquals(List.of(1,2,3), repeatDigits.repeatDigits(1234321));
    }
    @Test
    public void repeatDigitNullTest()
    {
        Assert.assertEquals(List.of(), repeatDigits.repeatDigits(123456));
    }
    @Test
    public void repeatDigitNegativeTest()
    {
        Assert.assertNotEquals(List.of(1), repeatDigits.repeatDigits(-121));
    }
}
