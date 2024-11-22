package algos.LeetCode;

public class PalindromeNumber {
    // --9-- //
    /*
    Given an integer x, return true if x is a palindrome, and false otherwise.

    Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

    Example 2:
    Input: x = -121
    Output: false

    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.
    Example 3:
    Input: x = 10
    Output: false

    Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int input = x;

        while (x > 0) {
            int lastDigit = x % 10;
            reverse = (reverse * 10) + lastDigit;
            x /= 10;
        }
        return reverse == input;
    }
}
