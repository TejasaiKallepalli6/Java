package lambdas;

import java.util.List;

public class MaximumElement {
    public static String MaximumElementMethod(List<String> list) {
        return list.stream().max(String::compareTo).orElse(null);
    }

}