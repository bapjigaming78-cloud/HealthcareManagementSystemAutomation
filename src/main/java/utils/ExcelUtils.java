package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static String getCellData(int rowNum, int colNum) {

        String path = "testdata/LoginData.xlsx";

        try {
            FileInputStream fis = new FileInputStream(path);

            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = workbook.getSheetAt(0);

            Row row = sheet.getRow(rowNum);

            Cell cell = row.getCell(colNum);

            String value = cell.toString();

            workbook.close();

            return value;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }
}