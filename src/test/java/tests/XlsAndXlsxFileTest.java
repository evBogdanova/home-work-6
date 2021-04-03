package tests;

import com.codeborne.xlstest.XLS;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getXls;
import static utils.Files.readXlsxFromPath;

public class XlsAndXlsxFileTest {

    @Test
    void xlsTest() throws IOException {
        String xlsFilePath = "./src/test/resources/files/1.xls";
        String expectedData = "Test file xls!";

        XLS xls = getXls(xlsFilePath);
        String actualData = xls.excel.getSheetAt(0).getRow(3).getCell(1).toString();
        assertThat(actualData, containsString(expectedData));

    }

    @Test
    void xlsxTest() throws IOException {
        String xlsFilePath = "./src/test/resources/files/1.xlsx";
        String expectedData = "Test file xlsx!";

        String actualData = readXlsxFromPath(xlsFilePath);
        assertThat(actualData, containsString(expectedData));
    }

}
