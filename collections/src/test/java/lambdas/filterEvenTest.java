package lambdas;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class filterEvenTest {
    @Test
    public void filterEvenTestValid(){
        Assert.assertEquals(List.of(2,6,10),filterEven.filterAndDouble(List.of(1,2,3,4,5)));
        Assert.assertNotEquals(List.of(2,6,10),filterEven.filterAndDouble(List.of(2,3,4,5)));
    }
}
