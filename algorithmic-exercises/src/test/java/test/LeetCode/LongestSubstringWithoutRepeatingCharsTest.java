package test.LeetCode;

import algos.LeetCode.LongestSubstringWithoutRepeatingChars;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestSubstringWithoutRepeatingCharsTest {
    private final LongestSubstringWithoutRepeatingChars longestSubstringWithoutRepeatingChars = new LongestSubstringWithoutRepeatingChars();

    @Test
    void testLongestSubstringWithoutRepeatingCharacters(){
        String input1 = "abcabcbb";
        int result1 = longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(input1);
        assertEquals(3, result1, "Longest substring without repeating characters is 3 'abc'");

        String input2 = "bbbbbbb";
        int result2 = longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(input2);
        assertEquals(1, result2, "Longest substring without repeating characters is 3 'abc'");

        String input3 = "pwwekwewew";
        int result3 = longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(input3);
        assertEquals(3, result3, "Longest substring without repeating characters is 3 'abc'");
    }
}