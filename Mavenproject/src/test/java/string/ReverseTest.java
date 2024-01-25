package string;
import org.junit.Assert;
import org.junit.Test;

public class ReverseTest {
    @Test
    public void testReverse() {
        Reverse r = new Reverse();
        String output = r.reverseEachWordOfString("Java J2EE Reverse Me");
        Assert.assertEquals("avaJ EE2J esreveR eM","avaJ EE2J esreveR eM");
    }
    @Test
    public void testReverse1(){
        Reverse r1 = new Reverse();
        String output = r1.reverseEachWordOfString("Teja");
        Assert.assertEquals("ajeT","ajeT");

    }
    @Test
    public void testReverse2(){
        Reverse r2 = new Reverse();
        String output = r2.reverseEachWordOfString(" ");
        Assert.assertEquals(""," ");

    }
}
