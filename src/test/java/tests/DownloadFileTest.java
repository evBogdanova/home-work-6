package tests;

import com.codeborne.selenide.Configuration;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import utils.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.Files.readTextFromPath;

public class DownloadFileTest {

    @Test
    void selenideDownloadReadmeTest () throws IOException {

        Configuration.downloadsFolder = "./src/test/resources/files";
        open("https://github.com/evBogdanova/home-work-6/blob/main/README.md");
        File downloadedFile = $("#raw-url").download();
        String fileContent = Files.readTextFromFile(downloadedFile);
        assertThat(fileContent, containsString("home-work-6"));
    }

    @Test
    void csvTest() throws IOException {
        String csvFilePath = "./src/test/resources/files/1.csv";
        String expectedData = "hello qa.guru!";

        String actualData = readTextFromPath(csvFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
