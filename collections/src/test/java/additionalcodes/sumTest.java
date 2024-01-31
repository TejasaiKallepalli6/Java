package additionalcodes;

import org.junit.Assert;
import org.junit.Test;

public class sumTest {
    @Test
    public void sumTest()
    {
        int[] Array=new int[]{1,2,3,4,5,6};
        Assert.assertEquals(21,sum.sumofArray(Array));
        Assert.assertEquals(0,sum.sumofArray(new int[]{1,-1,2,-2}));
        Assert.assertEquals(10,sum.sumofArray(new int[]{6,4,10,-10}));

    }
}
