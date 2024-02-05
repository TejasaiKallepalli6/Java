package additionalcodes;

import org.junit.Assert;
import org.junit.Test;

public class repeatDigitsTest {
    @Test
    public void repeatDigitTest()
    {
        repeatDigits.repeatDigits(111111);

        Assert.assertEquals(new int[]{1}, repeatDigits.repeatDigits(111111));
    }
}
