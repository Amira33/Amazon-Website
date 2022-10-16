package com.AmazonApp.testcases;

import Pages.TodayDealsPage;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.AmazonApp.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import util.TestUtils;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TodayDealsTest extends TestBase {

    TodayDealsPage Deals = new TodayDealsPage();

    public TodayDealsTest() throws IOException {
        super();

    }


    //WebDriver driver;

    @BeforeMethod
    public void setUp(Method method) throws ATUTestRecorderException {

        setUpinitalization();    // method

//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//
//        // open amazon  application
//        driver.get("https://www.amazon.ae/");

//        // to control window size
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies(); // delete all the cookies
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

      //  recorder = new ATUTestRecorder("/Users/iAmira/IdeaProjects/AmazonAppProject/Videos", method.getName() , false);
      //  recorder.start();
    }


    @AfterMethod
    public void ShitDown(Method method) throws IOException, ATUTestRecorderException {

        TestUtils.takeScreenShot(method.getName());   // for screen shot
       // recorder.stop();        // for take video
        driver.quit();
    }

    @Test (priority = 2)

    public void TodayDeals(Method method) throws InterruptedException {
//        WebElement TodayDeals = driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]"));
        Deals.TodayDealsButton().click();
        System.out.println("clicked on  TodayDealsText");

//        WebElement TodayDealsText = driver.findElement(By.xpath("//h1[contains(text(),\"Today's Deals\")]"));
        boolean actualResult = Deals.TodayDealsText().isDisplayed();
        Assert.assertTrue(actualResult, "This TodayDeals Text is not Displayed ");
        System.out.println(" TodayDeals cheklist is Appeared ");


        // Soft Assertion

//        SoftAssert soft = new SoftAssert();
//
////check to the Categories Checkboxes
//        System.out.println("***************************************************");
//        System.out.println("second  assertion using Categories Checkboxes");
//        soft.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Categories')]")).isDisplayed());
//        System.out.println("Categories Checkboxes is Displayed");


// to select the second category (Appliances)
//        WebElement CtegoriesCheckBoxes =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[21]/div[1]/div[1]/div[1]/div[2]/div[2]/span[3]/span[1]/ul[1]/li[2]/label[1]/input[1]"));
//        CtegoriesCheckBoxes.click();
//        System.out.println(" You are choosed Second Category (Appliances) ");



//  another Method to select Second Category (Appliances)

       // List<WebElement> ctegoriesCheckBoxes = driver.findElements(By.xpath("//span[text()='Appliances']"));

        System.out.println("Total number of Appliances Checkboxes are :  " + Deals.ctegoriesCheckBoxes().size());
        for (int i = 0; i < Deals.ctegoriesCheckBoxes().size(); i++)
        {

            Deals.ctegoriesCheckBoxes().get(0).click();
            System.out.println(" You are choosed Second Category (Appliances) ");


     }

// To choose the first Item
     //WebElement firstitem = driver.findElement(By.xpath("//div[contains(text(),\"Save on smartphone accessories\")]"));
     Deals.firstitem().click();
     System.out.println(" You are choosing First Item ");



 //Add it to cart with Qty = 3


        //WebElement Qty = driver.findElement( By.id("quantity"));
        Select yearvalue = new Select(Deals.Qty());
        yearvalue.selectByValue("3");

       // WebElement AddtocartButton = driver.findElement(By.id("add-to-cart-button"));
        Deals.AddtocartButton().click();

        // driver.findElement(By.id("attachSiNoCoverage")).click();    // for adding Extended Warranty Plan

       // driver.findElement(By.id("NATC_SMART_WAGON_CONF_MSG_SUCCESS"))
        Deals.ConfMSGSuccess().isDisplayed();   // for confirmation MSG


      //  WebElement Gotocart = driver.findElement(By.xpath("//div[@id='nav-cart-text-container']"));
         Deals.Gotocart().click();
        System.out.println("You  are clicked on Cart");




        // Soft Assertion

        SoftAssert soft = new SoftAssert();

//multi  assertion using price and qty and subtotal

        System.out.println("***************************************************");
        System.out.println("first  assertion using price");
        soft.assertTrue(Deals.PriceFirstassert().isDisplayed());
        System.out.println("Correct items are added (By Price)");

        JavascriptExecutor js  = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='3px solid red'" ,Deals.PriceFirstassert());  // to make a red rectangular
        Thread.sleep(5000);

//**************************************************************
        System.out.println("second  assertion using qty");
        soft.assertTrue(Deals.QTYSecondassert().isDisplayed());
        System.out.println("Correct items are added (By Qty)");

        JavascriptExecutor js1  = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].style.border='3px solid red'" ,driver.findElement(By.id("a-autoid-0-announce")));  // to make a red rectangular
        Thread.sleep(5000);

// *************************************************************

        System.out.println("third  assertion using subtotal ");
        soft.assertTrue(Deals.SubtotslThirdassert().isDisplayed());
        System.out.println("Correct items are added (By subtotal)");

        JavascriptExecutor js2  = ((JavascriptExecutor) driver);
        js2.executeScript("arguments[0].style.border='3px solid red'" ,Deals.SubtotslThirdassert());  // to make a red rectangular
        Thread.sleep(5000);


//****************************************************************
//        System.out.println("forth   assertion using name  ");
//        soft.assertTrue(driver.findElement(By.xpath("//*[@id=\"sc-item-Cc4981080-5dd5-4410-8f9c-061a3b97205b\"]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span[1]/span/span[2]/text()")).isDisplayed());
//        System.out.println("Correct iems are added (By name)");
//
//        JavascriptExecutor js3  = ((JavascriptExecutor) driver);
//        js3.executeScript("arguments[0].style.border='3px solid red'" ,driver.findElement(By.xpath("//*[@id=\"sc-item-Cc4981080-5dd5-4410-8f9c-061a3b97205b\"]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span[1]/span/span[2]/text()")));  // to make a red rectangular
//        Thread.sleep(5000);
//




        soft.assertAll();     // to show if it pass or fail


    }
}


