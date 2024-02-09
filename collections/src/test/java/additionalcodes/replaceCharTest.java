package additionalcodes;

import org.junit.Assert;
import org.junit.Test;

public class replaceCharTest {
    @Test
    public void replaceCharTestValid(){
        Assert.assertEquals("kNvDrAMbAbU",replaceChar.charReplace("KnVdRamBaBu"));

    }
    @Test
    public void replaceCharTestInValid(){
        Assert.assertNotEquals("TEJASAI",replaceChar.charReplace("TEJASAI"));

    }
}
