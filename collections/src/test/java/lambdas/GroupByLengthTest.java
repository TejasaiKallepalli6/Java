package lambdas;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class GroupByLengthTest {
    @Test
    public void GroupByLengthTestValid(){

        Assert.assertEquals(List.of("a","b","c"),GroupByLength.
                grouping(List.of("a","b","c","df","klj","aasd","hgfjd"))
                .get(1));

    }
    @Test
    public void GroupByLengthTestInValid(){

        Assert.assertNotEquals(List.of("b","c"),GroupByLength.
                grouping(List.of("a","b","c","df","klj","aasd","hgfjd"))
                .get(1));

    }
}
