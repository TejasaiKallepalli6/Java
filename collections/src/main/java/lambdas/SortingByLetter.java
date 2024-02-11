package lambdas;

import java.util.List;
import java.util.stream.Collectors;



public class SortingByLetter {
    public static List<String> soritngByLetter(List<String> inputList){
        return inputList.stream()
                .filter(input-> input.substring(0,1).equals("A"))
                .collect(Collectors.toList());
    }

}
