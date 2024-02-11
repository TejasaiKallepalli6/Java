package lambdas;

import java.util.*;

public class GroupByLength {
public static HashMap<Integer,List<String>> grouping(List <String> inputList){
    HashMap<Integer,List<String>> outputList= new HashMap<>();
    inputList.forEach(input-> {
        List<String> list = new ArrayList<>();
        if(outputList.containsKey(input.length())) {
           list = outputList.get(input.length());
           list.add(input);
        }
        else {
            list.add(input);
        }
        outputList.put(input.length(), list);
    });
    return outputList;
}


}
