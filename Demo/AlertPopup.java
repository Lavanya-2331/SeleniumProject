package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Web Driver\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver= new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		        driver.switchTo().frame("iframeResult");
		        driver.findElement(By.xpath("/html/body/button")).click();
		        try
		        {
		        
		        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
				wait.until(ExpectedConditions.alertIsPresent());
				String alrt = driver.switchTo().alert().getText();
				System.out.print(alrt);
				driver.switchTo().alert().accept();
		        
		        }
		        catch(Exception ex)
		        {
		        	System.out.println(ex);
		        }
		        driver.close();
		        }
		        
		        
	}

