package additionalcodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static additionalcodes.uniqueWords.isUniqueWords;

public class uniqueWordsTest {
    @Test
    public void isUniqueWordsTest()
    {

        Assert.assertEquals(6, uniqueWords.isUniqueWords("This is a sample string and string have characters"));
        //Failure
        Assert.assertNotEquals(3, uniqueWords.isUniqueWords("shiva"));
        //Edge case
        Assert.assertEquals(0,uniqueWords.isUniqueWords(""));

    }
}
