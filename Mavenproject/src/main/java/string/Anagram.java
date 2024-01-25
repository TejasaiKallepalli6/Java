package string;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String str1, String str2) {
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        if(str1.length() != str2.length())
            return false;
        Arrays.sort(char1);
        Arrays.sort(char2);
        for(int i = 0; i < char1.length; i++) {
            if(char1[i] != char2[i])
                return false;
        }
        return true;
    }
}
