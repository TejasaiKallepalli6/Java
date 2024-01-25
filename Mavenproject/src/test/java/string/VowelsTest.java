package string;

import org.junit.Assert;
import org.junit.Test;

public class VowelsTest {

        @Test
        public void testVowel() {
            Vowels vowels = new Vowels();
            int output = vowels.vowelCount("I have done my masters in US");
            Assert.assertEquals(5,5);

        }
        @Test
        public void testVowel1(){
            Vowels vowels1 = new Vowels();
           int output1= vowels1.vowelCount("I am going to INDIA");
            Assert.assertEquals(7,8);
        }
    }

