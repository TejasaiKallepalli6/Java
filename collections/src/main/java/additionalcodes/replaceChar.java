package additionalcodes;
import java.lang.*;

public class replaceChar {
    public  static String charReplace(String input)
    {
        char [] charArray= input.toCharArray();
        String s="";
        for(int i=0;i<charArray.length;i++)
        {
            if(Character.isLowerCase(charArray[i])){
                charArray[i]=Character.toUpperCase(charArray[i]);
                s=s+charArray[i];
            }else if (Character.isUpperCase(charArray[i])){
                charArray[i]=Character.toLowerCase(charArray[i]);
                s=s+charArray[i];
        }
        }

        return s;
    }


}
