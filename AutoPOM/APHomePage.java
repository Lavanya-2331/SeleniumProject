package AutoPOM;



    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;



   public class APHomePage {
        WebDriver driver;



       By homePageUserName = By.xpath("//span[contains(text(),'Kumar Selenium')]");



   public APHomePage(WebDriver driver){



       this.driver = driver;}



       //Get the User name from Home Page



   public String getHomePageDashboardUserName(){



            return driver.findElement(homePageUserName).getText();



           }



   }