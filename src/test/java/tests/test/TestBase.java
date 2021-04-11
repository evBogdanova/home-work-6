package tests.test;

import net.lingala.zip4j.exception.ZipException;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import tests.page.*;

import java.io.File;
import java.io.IOException;

public class TestBase {

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

    @Test
    public void pdfFileTest() throws IOException {
        PdfFile.pdf(filePathPdf, expectedDataPdf);
    }

    @Test
    public void docxFileTest() throws IOException {
        DocxFile.docx(docxFile, expectedDataDocx);
    }

    @Test
    public void txtFileTest() throws IOException {
        TxtFile.txt(filePathTxt, expectedDataTxt);
    }

    @Test
    public void xlsFileTest() throws IOException {
        XlsAndXlsxFile.xls(filePathXls, expectedDataXls);
    }

    @Test
    public void xlsxFileTest() throws IOException {
        XlsAndXlsxFile.xlsx(filePathXlsx, expectedDataXlsx);
    }

    @Test
    public void zipFileTest() throws IOException, ZipException {
        ZipFile.zip(filePathZip, unzipFolderPath, unzipTxtFilePath, expectedDataZip);
        FileUtils.deleteDirectory(new File(unzipFolderPath));
    }
}
