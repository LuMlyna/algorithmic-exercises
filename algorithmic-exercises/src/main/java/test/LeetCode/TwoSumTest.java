package test.LeetCode;

import LeetCode.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void testSolutionValidInput() throws IllegalAccessException {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.solution(nums, target);
        assertArrayEquals(new int[]{0, 1}, result, "The solution should return indices [0, 1] for input {2, 7, 11, 15} and target 9");
    }

    @Test
    void testSolutionAnotherValidInput() throws IllegalAccessException {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.solution(nums, target);
        assertArrayEquals(new int[]{1, 2}, result, "The solution should return indices [1, 2] for input {3, 2, 4} and target 6");
    }

    @Test
    void testSolutionNoSolution() {
        int[] nums = {1, 2, 3};
        int target = 7;

        Exception exception = assertThrows(IllegalAccessException.class, () -> {
            solution.solution(nums, target);
        });
        assertEquals("No two sum solution", exception.getMessage(), "The exception message should be 'No two sum solution'");
    }

    @Test
    void testSolutionDuplicateElements() throws IllegalAccessException {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = solution.solution(nums, target);
        assertArrayEquals(new int[]{0, 1}, result, "The solution should return indices [0, 1] for input {3, 3} and target 6");
    }
}