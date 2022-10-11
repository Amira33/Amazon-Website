package util;

import com.AmazonApp.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TestUtils extends TestBase {

    public TestUtils() throws IOException {
            super();
        }

        public static  void takeScreenShot (String name) throws IOException {

            // ********** Take screeen shot ************

            File srcFile = ((TakesScreenshot)driver ).getScreenshotAs(OutputType.FILE);                       // casting in java to turn from tupe to another
            FileUtils.copyFile(srcFile, new File("/Users/iAmira/IdeaProjects/AmazonAppProject/ScreenShots/"+name+".png"));



        }
}
