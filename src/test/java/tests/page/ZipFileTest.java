package tests.page;

import net.lingala.zip4j.exception.ZipException;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextFromPath;
import static utils.Zip.unzip;

public class ZipFileTest {

    public static void zipTest(String filePathZip, String unzipFolderPath, String unzipTxtFilePath, String expectedDataZip) throws IOException, ZipException {
        unzip(filePathZip, unzipFolderPath);
        String actualData = readTextFromPath(unzipTxtFilePath);
        assertThat(actualData, containsString(expectedDataZip));
    }
}
