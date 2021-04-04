package tests.page;

import com.codeborne.xlstest.XLS;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getXls;
import static utils.Files.readXlsxFromPath;

public class XlsAndXlsxFileTest {

    public static void xlsTest(String filePathXls,  String expectedDataXls) throws IOException {
        XLS xls = getXls(filePathXls);
        String actualData = xls.excel.getSheetAt(0).getRow(3).getCell(1).toString();
        assertThat(actualData, containsString(expectedDataXls));
    }

    public static void xlsxTest(String filePathXlsx,  String expectedDataXlsx) throws IOException {
        String actualData = readXlsxFromPath(filePathXlsx);
        assertThat(actualData, containsString(expectedDataXlsx));
    }
}
