package hashSet;

import java.util.*;

public class hashSet {

        public static void  setUsingIterator(HashSet<String> stringSet) {
            // Iterate using Iterator
            System.out.println("Iterating using Iterator:");
            String element = "";
            Iterator<String> iterator = stringSet.iterator();
            while (iterator.hasNext()) {
                 element = iterator.next();
                System.out.println(element);
            }

        }

        // Iterate using for loop
        public static void setUsingForLoop(HashSet<String> stringSet) {
            System.out.println("\nIterating using for loop:");
            for (String element : stringSet) {
                System.out.println(element);
            }
        }

        public static void setUsingEnhanced(HashSet<String> stringSet){
            // Iterate using enhanced for loop
            System.out.println("\nIterating using enhanced for loop:");
            Object[] stringArray = stringSet.toArray();
            for (int i = 0; i < stringArray.length; i++) {
                String element = (String) stringArray[i];
                System.out.println(element);
            }
        }
    }
