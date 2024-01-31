package additionalcodes;

import org.junit.Assert;
import org.junit.Test;

public class factorialTest {
    @Test
    public void factorialTest()
    {
        factorial.factorial(11);
        Assert.assertEquals(1,factorial.factorial(0));
        Assert.assertEquals(121,121);
        Assert.assertEquals(-1,factorial.factorial(-1));
    }
}
