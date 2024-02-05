package additionalcodes;

public class repeatDigits {
    public static int[] repeatDigits(int number)
    {
        int j=0;
        int [] array = new int[11];
        while(number!=0)
        { int digit = number%10;
            array[j]=digit;
            number=number/10;
            j++;


        }
        int [] result = new int[j];
        for(int i=0;i<= array.length;i++)
        {
            for(int k=i+1;k<=array.length;k++)
            {
                if(array[i]==array[k])
                {
                    result[i]=array[k];
                }
            }
        }
        return result;


    }
}