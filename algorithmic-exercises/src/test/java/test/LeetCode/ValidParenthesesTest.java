package test.LeetCode;

import algos.LeetCode.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void validParenthesesTest(){
        assertEquals(true, validParentheses.isValid("()"));
        assertEquals(true, validParentheses.isValid("(){}[]"));
        assertEquals(false, validParentheses.isValid("({)"));
        assertEquals(true, validParentheses.isValid("[()]"));
    }
}