package Pages;

import com.AmazonApp.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static com.AmazonApp.base.TestBase.driver;

public class LoginPage extends TestBase{

    public LoginPage() throws IOException {
        super();
    }


    public WebElement SigninButton() {
        return    driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
    }


    public WebElement EmailTextBox() {
        WebElement EmailTextBox = driver.findElement(By.name("email"));
        return EmailTextBox;
    }

    public WebElement continueButton() {
        return driver.findElement(By.xpath("//input[@id='continue']"));
    }


    public WebElement logsecondassert() {
        return driver.findElement(By.xpath("//span[contains(text(),'We cannot find an account with that email address')]"));
    }

    public WebElement logthirdassert() {

      return   driver.findElement(By.cssSelector("#createAccountSubmit"));
    }







}
