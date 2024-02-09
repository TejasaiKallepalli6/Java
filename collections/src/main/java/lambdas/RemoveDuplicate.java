package lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static List<Integer> eliminate(List<Integer> list){
        return list.stream()
                .distinct().collect(Collectors.toList());
    }
}
