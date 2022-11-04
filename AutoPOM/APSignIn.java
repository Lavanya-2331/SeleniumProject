package AutoPOM;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class APSignIn {
WebDriver driver;
By sign = By.xpath("//a[contains(text(),'Sign in')]");
public APSignIn(WebDriver driver)
{
     this.driver=driver;
}
public void clickLogin()
{
    driver.findElement(sign).click();
}
}