package tests.page;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.Files.getDoc;

public class DocxFile {

    public static void docx(File docxFile, String expectedDataDocx) throws IOException {
        String doc = getDoc(docxFile);
        assertTrue(doc.contains(expectedDataDocx));

    }
}
