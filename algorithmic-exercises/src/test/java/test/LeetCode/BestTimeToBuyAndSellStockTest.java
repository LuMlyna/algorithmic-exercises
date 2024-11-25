package test.LeetCode;

import algos.LeetCode.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BestTimeToBuyAndSellStockTest {
    private final BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    void maxProfitExist(){
        int [] input = {7,1,5,3,6,4};
        int output = bestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(5, output, "Output is 5.");
    }

    @Test
    void maxProfitDoesNotExist(){
        int [] input = {7,6,4,3,1};
        int result = bestTimeToBuyAndSellStock.maxProfit(input);
        assertEquals(0, result, "This trade doesn't have profit.");
    }
}