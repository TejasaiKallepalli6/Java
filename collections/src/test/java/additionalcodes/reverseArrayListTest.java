package additionalcodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class reverseArrayListTest {
    @Test
    public void reverseArrayListTest1()
    {
        ArrayList<Integer> expectedArrayList =new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Assert.assertEquals(expectedArrayList,reverseArrayList.getReverse(new ArrayList<Integer>(Arrays.asList(6,5,4,3,2,1))));
    }
    @Test
    public void reverseArrayListTest2()
    {
        ArrayList<Integer> expectedArrayList =new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Assert.assertNotEquals(expectedArrayList,reverseArrayList.getReverse(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6))));
    }
}
