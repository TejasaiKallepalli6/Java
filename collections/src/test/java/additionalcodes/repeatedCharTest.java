package additionalcodes;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class repeatedCharTest {
    @Test
    public void testrepeatedChar() {
        String input1 = "abacabad";
        String expected1 = "ab";
        assertEquals(expected1, repeatedChar.isrepeatedChar(input1));


        String input2 = "hello";
        String expected2 = "l";
        assertEquals(expected2, repeatedChar.isrepeatedChar(input2));


        String input3 = "programming";
        String expected3 = "rgm";
        assertEquals(expected3, repeatedChar.isrepeatedChar(input3));


        String input4 = "abcdefg";
        String expected4 = "";
        assertEquals(expected4, repeatedChar.isrepeatedChar(input4));

    }
}
