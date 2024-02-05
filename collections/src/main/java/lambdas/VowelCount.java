package lambdas;

import java.util.Arrays;

public class VowelCount {

    public static boolean containsVowels(String s) {
        return s.toLowerCase().matches(".*[aeiou].*");
    }

    public static long countVowels(String s) {
        return s.toLowerCase().
                chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }

    public static void printStringsWithVowelCount(String[] strings) {
        Arrays.stream(strings)
                .filter(VowelCount::containsVowels)
                .forEach(s -> System.out.println(s + " - Number of Vowels: " + VowelCount.countVowels(s)));
    }
}
