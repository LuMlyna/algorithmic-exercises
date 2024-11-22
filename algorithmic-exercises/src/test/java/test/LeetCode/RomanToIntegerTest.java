package test.LeetCode;

import algos.LeetCode.RomanToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntegerTest {
    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void testRomanToIntegerSimpleNumber(){
        String input = "III";
        int result = romanToInteger.romanToInt(input);
        assertEquals(3, result,"III should convert to 3");
    }

    @Test
    void testRomanToIntegerNumbers(){
        assertEquals(58, romanToInteger.romanToInt("LVIII"),"LVIII should convert to 58");
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"),"MCMXCIV should convert to 1994");
    }

}