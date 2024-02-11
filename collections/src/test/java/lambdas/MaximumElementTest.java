package lambdas;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MaximumElementTest {
    @Test
    public void MaximumElementTestValid(){
        Assert.assertEquals("Teja", MaximumElement.MaximumElementMethod(List.of("Teja","Sai","Kallepalli")));

    }
}
