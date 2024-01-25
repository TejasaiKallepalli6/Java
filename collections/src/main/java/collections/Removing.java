package collections;

import java.util.ArrayList;

public class Removing {

    public static void removeLastElement(ArrayList<String> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }
}