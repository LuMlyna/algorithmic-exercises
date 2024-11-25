package test.LeetCode;

import algos.LeetCode.ExcelSheetColumnTitle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExcelSheetColumnTitleTest {
    private final ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();

    @Test
    void convertingColumnToTitle(){
        int input = 26;
        String result = excelSheetColumnTitle.convertToTitle(input);
        assertEquals("Z", result, "For column 26 is title Z");
    }

}