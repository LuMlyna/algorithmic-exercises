package test.LeetCode;

import algos.LeetCode.PlusOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlusOneTest {
    private final PlusOne plusOne = new PlusOne();

    @Test
    void plusOneTest() {
        int[] digits1 = {1, 2, 3};
        int[] expected1 = {1, 2, 4};
        assertArrayEquals(expected1, plusOne.plusOne(digits1));

        int[] digits2 = {4, 3, 2, 1};
        int[] expected2 = {4, 3, 2, 2};
        assertArrayEquals(expected2, plusOne.plusOne(digits2));

        int[] digits3 = {9};
        int[] expected3 = {1, 0};
        assertArrayEquals(expected3, plusOne.plusOne(digits3));
    }
}