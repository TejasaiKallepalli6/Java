package additionalcodes;

public class palindrome {
    public static boolean isPalindrome(int number)
    {  int number1=0;
        int original=number;
        if (number ==0) {
            return false;
        } else if (number < 0) {
            return false;

        } else {
            while(number!=0) {
                int digit = number % 10;
                number1 = number1 * 10 + digit;
                number = number / 10;
            }
        }

        return number1==original;
    }

}
