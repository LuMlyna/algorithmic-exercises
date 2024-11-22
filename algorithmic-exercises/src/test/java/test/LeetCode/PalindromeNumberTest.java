package test.LeetCode;

import algos.LeetCode.PalindromeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {
    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void testIsPalindromePositiveNumber(){
        int input = 121;
        boolean result = palindromeNumber.isPalindrome(input);
        assertTrue(result, "Number is a palindrome");
    }

    @Test
    void testIsPalindromeNegativeNumber(){
        int input = -121;
        boolean result = palindromeNumber.isPalindrome(input);
        assertFalse(result, "Number is negative, so it is not a palindrome.");
    }

    @Test
    void testIsPalindromeNonPalindromeNumber(){
        int input = 10;
        boolean result = palindromeNumber.isPalindrome(input);
        assertFalse(result, "Number is not a palindrome.");
    }
}