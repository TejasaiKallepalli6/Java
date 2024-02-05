package lambdas;

import java.util.Arrays;

class StringManipulation {
    public static void main(String[] args) {
        String[] strings = {"teja", "sai", "trinadh", "venkat", "siva"};

        // Capitalize the first letter of each string
        Arrays.stream(strings)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .forEach(System.out::println);
    }
}