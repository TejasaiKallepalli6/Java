package string;

public class Rotation {


    static boolean  checkRotation(String str1 , String str2)
    {
        if (str1.length()!=str2.length())
        {
            return false;
        }
        String str = str1+str1;
        return str.contains(str2);
    }
}
