package additionalcodes;

public class sum {
    public static int sumofArray(int[] a)
    { int sumofarray=0;
        for(int i=0;i<a.length;i++)
        {
            sumofarray = sumofarray + a[i];
        }
        return sumofarray;
    }
}
