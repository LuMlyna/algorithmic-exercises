package algos.LeetCode;

public class ExcelSheetColumnTitle {
    // --168-- //
    /*
    Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

    For example:
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
     */
    public String convertToTitle(int columnTitle) {
        StringBuilder columnNumber = new StringBuilder();

        while (columnTitle > 0) {
            int remainder = (columnTitle - 1) % 26;
            columnNumber.insert(0, (char)('A' + remainder));
            columnTitle = (columnTitle - 1) / 26;
        }

        return columnNumber.toString();
    }
}
