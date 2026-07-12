package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {

        return new Object[][] {
            {ExcelUtils.getCellData(1,0), ExcelUtils.getCellData(1,1)},
            {ExcelUtils.getCellData(2,0), ExcelUtils.getCellData(2,1)},
            {ExcelUtils.getCellData(3,0), ExcelUtils.getCellData(3,1)}
        };
    }
}