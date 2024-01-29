package collections;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
public class ArrayListToArrayTest {

    @Test
    public void testArrayListToArrayConversion() {
        // Creating an ArrayList of Strings
        ArrayList<String> bike = new ArrayList<>();
        bike.add("Duke");
        bike.add("RE");
        bike.add("Hero");
        bike.add("Honda");

        // Converting ArrayList to Array
        String[] bikeArray = ArrayListToArray.convertArrayListToArray(bike);

        // Check if the size of the array is the same as the ArrayList
        Assert.assertEquals(bike.size(), bikeArray.length);
    }

    @Test
    public void testArrayListToArrayElements() {
        // Creating an ArrayList of Strings
        ArrayList<String> bike = new ArrayList<>();
        bike.add("Duke");
        bike.add("RE");
        bike.add("Hero");
        bike.add("Honda");

        // Converting ArrayList to Array
        String[] bikeArray = ArrayListToArray.convertArrayListToArray(bike);

        // Check if each element in the array is equal to the corresponding element in the ArrayList
        Assert.assertEquals(bike.toArray(), bikeArray);
    }

    @Test
    public void testArrayListToArrayEmptyList() {
        // Creating an empty ArrayList of Strings
        ArrayList<String> emptyList = new ArrayList<>();

        // Converting empty ArrayList to Array
        String[] emptyArray = ArrayListToArray.convertArrayListToArray(emptyList);

        // Check if the size of the array is 0 for an empty ArrayList
        Assert.assertEquals(0, emptyArray.length);
    }
}

