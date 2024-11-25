package test.LeetCode;

import algos.LeetCode.ValidPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPalindromeTest {
    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void isPalindrome(){
        String input = "A man, a plan, a canal: Panama";
        boolean result = validPalindrome.isPalindrome(input);
        assertEquals(true, result, "\"amanaplanacanalpanama\" is a palindrome.");
    }

    @Test
    void isNotAPalindrome(){
        String input = "race a car";
        boolean result = validPalindrome.isPalindrome(input);
        assertEquals(false, result, "'raceacar' is not a palindrome.");
    }

    @Test
    void emptyStringIsAPalindrome(){
        String input = " ";
        boolean result = validPalindrome.isPalindrome(input);
        assertEquals(true, result, "Empty string is a palindrome.");
    }
}