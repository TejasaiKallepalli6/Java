package additionalcodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class repeatDigits {
    public static ArrayList<Integer> repeatDigits(int number) {
        HashMap<Integer, Integer> repeatDigits = new HashMap<>();
        int count;
        while (number != 0) {
            count = 1;
            int digit = number % 10;
            if (repeatDigits.containsKey(digit)) {
                repeatDigits.put(digit, count + 1);
            } else repeatDigits.put(digit, count);

            number = number / 10;

        }ArrayList<Integer> result=new ArrayList<>();
        for (Map.Entry<Integer,Integer> mapentry : repeatDigits.entrySet()){
            if (mapentry.getValue() > 1) {

                result.add(mapentry.getKey());
            }
        }
        return result;

    }


}
