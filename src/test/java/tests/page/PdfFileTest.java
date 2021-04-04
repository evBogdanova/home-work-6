package tests.page;

import com.codeborne.pdftest.PDF;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getPdf;

public class PdfFileTest {

    public static void pdfTest(String pdfFilePath, String expectedData) throws IOException {
        PDF pdf = getPdf(pdfFilePath);
        assertThat(pdf, PDF.containsText(expectedData));
    }
}
