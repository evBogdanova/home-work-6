package tests.page;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readTextFromPath;

public class TxtFileTest {

    public static void txtTest(String filePathTxt, String expectedDataTxt) throws IOException {
        String actualData = readTextFromPath(filePathTxt);
        assertThat(actualData, containsString(expectedDataTxt));
    }
}
