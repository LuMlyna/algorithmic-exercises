package test.LeetCode;

import algos.LeetCode.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest {
    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void haveLongestCommonPrefix(){
        String [] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("fl", result, "Prefix is 'fl'.");
    }

    @Test
    void doesntHaveLongestCommonPrefix(){
        String [] strs = {"dog","racecar","car"};
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("", result, "Longest common prefix doesn't exist.");
    }
}