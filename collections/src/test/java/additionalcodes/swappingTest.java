package additionalcodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import additionalcodes.palindrome;
import org.junit.Assert;
import org.junit.Test;


public class swappingTest {
    @Test
    public void swappingTest()
    {
        swapping.swapWithoutTemp(4,3);
        assertEquals(3,3);
        assertEquals(4,4);
        assertNotEquals(4,3);
    }

}
