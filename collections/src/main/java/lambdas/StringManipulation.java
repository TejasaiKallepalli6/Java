package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StringManipulation {
    static List<String> stringConversion(String[] strings){
        if(strings.length==0)
            return null;


        // Capitalize the first letter of each string
        return Arrays.stream(strings)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .collect(Collectors.toList());


    }
}