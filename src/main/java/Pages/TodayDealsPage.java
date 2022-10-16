package Pages;

import com.AmazonApp.base.TestBase;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class TodayDealsPage  extends TestBase {

    public TodayDealsPage() throws IOException {
        super();
    }

    public WebElement TodayDealsButton() {
        return driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]"));
    }

    public WebElement TodayDealsText() {

        return driver.findElement(By.xpath("//h1[contains(text(),\"Today's Deals\")]"));
    }

    public List<WebElement> ctegoriesCheckBoxes() {
        return driver.findElements(By.xpath("//span[text()='Appliances']"));
    }

    public WebElement firstitem() {

        return driver.findElement(By.xpath("//div[contains(text(),\"Save on smartphone accessories\")]"));
    }

    public WebElement Qty() {

        return driver.findElement(By.id("quantity"));
    }

    public WebElement AddtocartButton() {

        return driver.findElement(By.id("add-to-cart-button"));
    }

    public  WebElement ConfMSGSuccess(){
        return  driver.findElement(By.id("NATC_SMART_WAGON_CONF_MSG_SUCCESS"));
    }
   public WebElement Gotocart(){

   return driver.findElement(By.xpath("//div[@id='nav-cart-text-container']"));
   }


  public WebElement PriceFirstassert(){
    return driver.findElement(By.xpath("//span[contains(text(),'AED 111.99')]"));
  }

  public WebElement QTYSecondassert(){
        return driver.findElement(By.cssSelector("#a-autoid-0"));
  }
  public  WebElement SubtotslThirdassert(){
        return driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]"));
  }
}