package AutomationPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Web Driver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String url ="http://automationpractice.com/index.php";
        driver.get(url);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("alert('Welcome to Automation practice');");
        Alert alt = driver.switchTo().alert();
        alt.accept();
        
        js.executeScript("document.getElementsByName('search_query')[0].value='dress'");
        js.executeScript("document.getElementsByName('submit_search')[0].click()");
        
        Thread.sleep(2000);
        
        
        String sText = js.executeScript("return document.title;").toString();
        
        driver.close();

	}

}
