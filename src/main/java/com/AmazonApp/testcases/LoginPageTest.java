package com.AmazonApp.testcases;

import Pages.AccountListsPage;
import Pages.LoginPage;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.AmazonApp.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import util.TestUtils;
import com.AmazonApp.testcases.AccountLists;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class LoginPageTest extends TestBase {

    LoginPage log = new LoginPage();  //new object to use in class to call the method
    AccountListsPage Account = new AccountListsPage();

    public LoginPageTest() throws IOException {
        super();     // make run constarctor of parent
    }

    // WebDriver driver;

    @BeforeMethod
    public void setUp(Method method)  throws ATUTestRecorderException {


        setUpinitalization();    // method

//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//
//        // open amazon  application
//        driver.get("https://www.amazon.ae/");

//        // to control window size
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies(); // delete all the cookies
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



       // recorder = new ATUTestRecorder("/Users/iAmira/IdeaProjects/AmazonAppProject/Videos", method.getName() , false);
      //  recorder.start();
       // driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))
               log.SigninButton() .click();

    }

    @AfterMethod
    public void ShitDown(Method method)  throws ATUTestRecorderException, IOException{

        TestUtils.takeScreenShot(method.getName());   // for screen shot
       // recorder.stop();        // for take video
        driver.quit();
    }

    @Test(priority = 1)

    public void LoginTest(Method method)throws IOException {


       // WebElement EmailTextBox = driver.findElement(By.name("email"));
      //  WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));

       log.EmailTextBox().sendKeys(prop.getProperty("email"));
       log.continueButton().click();

        // Hard Assertion
        System.out.println("First  Assertion  using Title ");
        String expectedResult = "Amazon Sign In";
        String actualResult = driver.getTitle();
        System.out.println("Actual Result of the Title is " + actualResult);
        Assert.assertEquals(actualResult, expectedResult, " The Email is not Registered ");



       // Soft Assertion

        SoftAssert soft = new SoftAssert();

//second  assertion using Msg text
      System.out.println("***************************************************");
      System.out.println("second  assertion using Msg text");
      soft.assertTrue(log.logsecondassert().isDisplayed());
      System.out.println("MSG Text is Displayed");


// Third ASSERTION to check Create your Amazon account Button is Displayed
        System.out.println("***************************************************");
        System.out.println("Third ASSERTION");
        soft.assertTrue(log.logthirdassert().isDisplayed(),"Third assertion Create your Amazon account Button is not Displayed ");
        System.out.println("Create your Amazon account Button is Displayed");

        System.out.println("***************************************************");
        System.out.println(" Forth Assertion  using URL ");
        soft.assertTrue(Account.accountSecondassert(),"Forth assertion");
        System.out.println(" You still in Sign in Url ");


        soft.assertAll();     // to show if it pass or fail


    }
}



