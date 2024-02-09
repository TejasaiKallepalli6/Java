package lambdas;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RemoveDuplicateTest {
    @Test
    public void duplicateTest(){
        Assert.assertEquals(List.of(1,2,3,4),RemoveDuplicate.eliminate(List.of(1,1,1,2,2,2,3,3,3,4,4,4)));
    }
}

