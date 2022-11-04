package OhrmPOM;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;



	public class OHRMHomePage {
	    WebDriver driver;

	   By homePageUserName = By.xpath("//p[@class='oxd-userdropdown-name']");

	public OHRMHomePage(WebDriver driver){

	   this.driver = driver;}

	   //Get the User name from Home Page

	public String getHomePageDashboardUserName(){

	        return driver.findElement(homePageUserName).getText();



	       }

	}

