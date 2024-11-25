package algos.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    // --20-- //
    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

    Example 1:
    Input: s = "()"
    Output: true

    Example 2:
    Input: s = "()[]{}"
    Output: true

    Example 3:
    Input: s = "(]"
    Output: false

    Example 4:
    Input: s = "([])"
    Output: true
     */
    public boolean isValid(String s) {
        List<Character> listOfChar = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                listOfChar.add(c);
            } else if (c == ')' && !listOfChar.isEmpty() && listOfChar.get(listOfChar.size() - 1) == '(') {
                listOfChar.remove(listOfChar.size() - 1);
            } else if (c == '}' && !listOfChar.isEmpty() && listOfChar.get(listOfChar.size() - 1) == '{') {
                listOfChar.remove(listOfChar.size() - 1);
            } else if (c == ']' && !listOfChar.isEmpty() && listOfChar.get(listOfChar.size() - 1) == '[') {
                listOfChar.remove(listOfChar.size() - 1);
            } else {
                return false;
            }
        }
        return listOfChar.isEmpty();
    }
}
