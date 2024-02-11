package lambdas;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SortingByLetterTest {
    @Test
    public void SortingByLetterTestvalid(){
        Assert.assertEquals(List.of("ABA","A"),SortingByLetter.soritngByLetter(List.of("ABA","B","C","A")));
    }
    @Test
    public void SortingByLetterTestInvalid(){
        Assert.assertNotEquals(List.of("A"),SortingByLetter.soritngByLetter(List.of("ABA","B","C","A")));
    }
}
