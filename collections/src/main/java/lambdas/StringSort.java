package lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {

    public static String[] sortStrings(String[] strings) {
        Arrays.sort(strings, Comparator.comparing(String::length)
                .thenComparing(Comparator.comparing(String::length).reversed())
                .thenComparing(Comparator.comparing(s -> {
                    return s.charAt(s.length() - 1);
                }).reversed()));

        return strings;
    }
}