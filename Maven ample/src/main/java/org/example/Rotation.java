public class Rotation {
    public static void main(String[] args) {
        String s1="JavaJ2eeStrutsHibernate";
        String s2="StrutsHibernateJavaJ2ee";
        if (checkRotation(s1,s2))
        {
            System.out.println("Output: True");
        }else
        {
            System.out.println("Output :False");
        }
    }
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
