package tests.test;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;
import tests.page.*;

import java.io.File;
import java.io.IOException;

public class TestBase {

    @Test
    public void fileTest () throws IOException, ZipException {
        String filePathPdf = "./src/test/resources/files/1.pdf";
        String expectedDataPdf = "";

        File docxFile = new File("./src/test/resources/files/1.docx");
        String expectedDataDocx = "Test file docx!";

        String filePathTxt = "./src/test/resources/files/1.txt";
        String expectedDataTxt = "Test file txt!";

        String filePathXls = "./src/test/resources/files/1.xls";
        String expectedDataXls = "Test file xls!";

        String filePathXlsx = "./src/test/resources/files/1.xlsx";
        String expectedDataXlsx = "Test file xlsx!";

        String filePathZip = "./src/test/resources/files/1.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String unzipTxtFilePath = "./src/test/resources/files/unzip/1.txt";
        String expectedDataZip = "Test file zip!";

        PdfFile.pdf(filePathPdf, expectedDataPdf);
        DocxFile.docx(docxFile, expectedDataDocx);
        TxtFile.txt(filePathTxt, expectedDataTxt);
        XlsAndXlsxFile.xls(filePathXls, expectedDataXls);
        XlsAndXlsxFile.xlsx(filePathXlsx, expectedDataXlsx);
        ZipFile.zip(filePathZip, unzipFolderPath, unzipTxtFilePath, expectedDataZip);
    }
}
