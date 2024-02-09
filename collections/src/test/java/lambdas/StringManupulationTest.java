package lambdas;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StringManupulationTest {
    @Test
    public void stringManupulationTestValid()
    {
        Assert.assertEquals(List.of("Knvd","Sai","Teja"),StringManipulation.stringConversion(new String[]{"teja", "sai", "knvd"}));
    }
    @Test
    public void stringManupulationTestNull()
    {
        Assert.assertNull(StringManipulation.stringConversion(new String[]{}));
    }
}
