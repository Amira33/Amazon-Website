package Pages;

import com.AmazonApp.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class AccountListsPage extends TestBase {

    public AccountListsPage() throws IOException {
        super();
    }

    public  WebElement SigninAccountmove() {

        return driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
    }
    public  WebElement OrderHyperlink() {

        return driver.findElement(By.xpath("//span[contains(text(),'Your Orders')]"));
    }
    public  WebElement accountfirstassert(){
        return driver.findElement(By.xpath("//body"));
    }
    public boolean accountSecondassert(){
        return driver.getCurrentUrl().contains("https://www.amazon.ae/ap/signin");
    }
    public  WebElement AddressesHyperlink() {

        return driver.findElement(By.xpath("//span[contains(text(),'Your Addresses')]"));
    }
   public  WebElement ListsHyperlink() {

    return driver.findElement(By.xpath("//span[contains(text(),'Your Lists')]"));
    }
    public WebElement wishlistPAge(){
        return driver.findElement(By.xpath("//div[@id='wishlist-page']"));
    }


}
