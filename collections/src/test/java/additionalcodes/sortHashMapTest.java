package additionalcodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class sortHashMapTest {
    @Test
    public void sortHashMapTest1() {
        Map<Integer, String> hashMap = createHashMap();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sai");
        map.put(2, "Teja");
        map.put(3, "Kallepalli");
        map.put(4, "Knvd");
        Assert.assertEquals(map,sortHashMap.sortHashMap1(hashMap));
    }


    public static Map<Integer, String> createHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "Teja");
        hashMap.put(1, "Sai");
        hashMap.put(3, "Kallepalli");
        hashMap.put(4, "Knvd");
        return hashMap;
    }
}
