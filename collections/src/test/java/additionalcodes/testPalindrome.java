package additionalcodes;
import static org.junit.Assert.*;
import additionalcodes.palindrome;
import org.junit.Test;

public class testPalindrome {
    @Test
    public void testPalindrome()
    {
        assertFalse(palindrome.isPalindrome(0));
        assertFalse(palindrome.isPalindrome(-98));
        assertTrue(palindrome.isPalindrome(121));
        assertTrue(palindrome.isPalindrome(123454321));
        assertTrue(palindrome.isPalindrome(555));
        assertTrue(palindrome.isPalindrome(545));
    }
}
