package collections;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;

public class ArrayListToArray {

    public static String[] convertArrayListToArray(ArrayList<String> list) {
        String[] array = new String[list.size()];
        return list.toArray(array);
    }
}
