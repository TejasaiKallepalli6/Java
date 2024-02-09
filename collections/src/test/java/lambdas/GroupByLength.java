package lambdas;

import java.util.List;

public class GroupByLength {
    public static List<Integer> groupBy(List<Integer> list){
        return list.stream()
                .filter(n->(list.size()));

    }
}
