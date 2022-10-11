package com.AmazonApp.testcases;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.AmazonApp.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import util.TestUtils;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class AccountLists extends TestBase {

    public AccountLists() throws IOException {
        super();     // make run constarctor of parent

    }

    @BeforeMethod
    public void setUp(Method method ) throws ATUTestRecorderException {

        setUpinitalization();    // method

//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies(); // delete all the cookies
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        recorder = new ATUTestRecorder("/Users/iAmira/IdeaProjects/AmazonAppProject/Videos", method.getName() , false);
        recorder.start();

    }

    @AfterMethod
    public void ShitDown(Method method ) throws IOException, ATUTestRecorderException {


        TestUtils.takeScreenShot(method.getName());   // for screen shot
        recorder.stop();        // for take video
        driver.quit();
    }

    @Test (priority = 3)
    public void SigninAccountO(Method method ) {
        WebElement SigninAccount = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));

        Actions actions = new Actions(driver);
        actions.moveToElement(SigninAccount).build().perform();
        System.out.println("you are selected  from Sign in Account & lists ");

        WebElement OrderHyperlink = driver.findElement(By.xpath("//span[contains(text(),'Your Orders')]"));
        OrderHyperlink.click();
        System.out.println(" ou clicked on Your Order link ");

        // Soft Assertion

        SoftAssert soft = new SoftAssert();

//multi  assertion
        System.out.println("***************************************************");
        System.out.println("first  assertion ");
        soft.assertTrue(driver.findElement(By.xpath("//body")).isDisplayed());
        System.out.println("You can't see The Orders because You are not Sign in ");

        System.out.println("***************************************************");
        System.out.println(" second  Assertion  using URL ");
        soft.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.ae/ap/signin"),"second assertion");
        System.out.println(" You still in Sign in Url ");

        soft.assertAll();     // to show if it pass or fail
    }





    @Test (priority = 4)
    public void SigninAccountA(Method method) {
        WebElement SigninAccount = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));

        Actions actions = new Actions(driver);
        actions.moveToElement(SigninAccount).build().perform();
        System.out.println("you are selected  from Sign in Account & lists ");

        WebElement AddressesHyperlink = driver.findElement(By.xpath("//span[contains(text(),'Your Addresses')]"));
        AddressesHyperlink.click();
        System.out.println(" ou clicked on Your Addresses link ");

        // Soft Assertion

        SoftAssert soft = new SoftAssert();

//multi  assertion
        System.out.println("***************************************************");
        System.out.println("first  assertion ");
        soft.assertTrue(driver.findElement(By.xpath("//body")).isDisplayed());
        System.out.println("You can't see The Orders because You are not Sign in ");

        System.out.println("***************************************************");
        System.out.println(" second  Assertion  using URL ");
        soft.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.ae/ap/signin"),"second assertion");
        System.out.println(" You still in Sign in Url ");

        soft.assertAll();     // to show if it pass or fail
    }




    @Test (priority = 5)
    public void SigninAccountL(Method method ) {
        WebElement SigninAccount = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));

        Actions actions = new Actions(driver);
        actions.moveToElement(SigninAccount).build().perform();
        System.out.println("you are selected  from Sign in Account & lists ");

        WebElement ListsHyperlink = driver.findElement(By.xpath("//span[contains(text(),'Your Lists')]"));
        ListsHyperlink.click();
        System.out.println(" ou clicked on Your Lists link ");

        // Soft Assertion

        SoftAssert soft = new SoftAssert();

//multi  assertion
        System.out.println("***************************************************");
        System.out.println("first  assertion ");
        soft.assertTrue(driver.findElement(By.xpath("//div[@id='wishlist-page']")).isDisplayed());
        System.out.println("You can see the screen of Lists ");

        System.out.println("***************************************************");
        System.out.println(" second  Assertion  using URL ");
        soft.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.ae/hz/wishlist/intro"),"second assertion");
        System.out.println(" You are  in Wishlist URL ");

        soft.assertAll();     // to show if it pass or fail
    }

}
