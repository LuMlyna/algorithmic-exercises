package algos.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    // --3-- //
    /*
    Given a string s, find the length of the longest substring without repeating characters.

    Example 1:
    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

    Example 2:
    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

    Example 3:
    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> seen = new HashSet<>();
        int maxLen = 0, left = 0, right = 0;
        while (right < n) {
            if (!seen.contains(s.charAt(right))) {
                seen.add(s.charAt(right++));
                maxLen = Math.max(maxLen, right - left);
            } else {
                seen.remove(s.charAt(left++));
            }
        }
        return maxLen;
    }
}
