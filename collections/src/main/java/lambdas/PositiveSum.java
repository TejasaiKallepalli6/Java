package lambdas;

import java.util.List;

public class PositiveSum {
    public static int printSum(List<Integer> list){
        return list.stream()
                .filter(n-> n>0)
                .mapToInt(n -> n)
                .sum();
    }
}
