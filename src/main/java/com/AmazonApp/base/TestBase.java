package com.AmazonApp.base;

//import atu.testrecorder.ATUTestRecorder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class TestBase {


    public static Properties prop;
    public static WebDriver driver;
    //public  static ATUTestRecorder recorder;

    public TestBase() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/iAmira/IdeaProjects/AmazonAppProject/src/main/java/config/configData.properties");
        prop.load(fis);
        }


    public void setUpinitalization() {    // method

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            // open amazon  application
          driver.get(prop.getProperty("URL"));
        // to control window size
         driver.manage().window().maximize();
          driver.manage().deleteAllCookies(); // delete all the cookies

        // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      //  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // time for the browser to load

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));


        }
    }


