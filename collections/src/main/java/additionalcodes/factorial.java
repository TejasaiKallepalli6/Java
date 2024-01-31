package additionalcodes;

public class factorial {
    public static int factorial(int a)
    {
        int fact=1;

       /* for(int i=a;i>=1;i--)
        {
            fact=fact * i;
        } */
        if(a >= 1)
            fact=fact*factorial(a-1);
        if(a<0)
            return -1;
        return fact;
    }

}
