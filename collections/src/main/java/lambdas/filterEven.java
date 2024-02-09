package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterEven {
    public static List<Integer> filterAndDouble(List<Integer> inputArray){
        return inputArray.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n + n)
                .collect(Collectors.toList());
    }
}
