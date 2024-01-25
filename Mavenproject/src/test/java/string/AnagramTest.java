package string;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
    @Test
    public void testAnagrams() {
        Anagram anagram = new Anagram();
        boolean output = anagram.isAnagram("care", "race");
        Assert.assertTrue(output);
    }
    @Test
    public void testAnagram2()
    {
        Anagram a= new Anagram();
        boolean out=a.isAnagram("Teja","Sai");
        Assert.assertFalse(out);

    }
}
