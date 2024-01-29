package hashSet;


import org.junit.Test;

import java.util.HashSet;

public class hashSetIterationTest {
    @Test
    public void testSetIterations(){
        HashSet<String> stringSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringSet.add("KTM");
        stringSet.add("RE");
        stringSet.add("Yamaha");
        stringSet.add("Bajaj");
        stringSet.add("Kawasaki");
        stringSet.add("Hero");
        stringSet.add("Honda");
        stringSet.add("Triumph");
        stringSet.add("Suzuki");
        stringSet.add("TVS");
        hashSet.setUsingIterator(stringSet);
        hashSet.setUsingForLoop(stringSet);
        hashSet.setUsingEnhanced(stringSet);


    }
}