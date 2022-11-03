package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginxml {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String driverPath= "C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Web Driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		
		//@Test(invocationCount=2)
	
		File src= new File("./TestResources/Login.xml");
		FileInputStream fis = new FileInputStream(src);	
		SAXReader saxReader = new SAXReader();
		org.dom4j.Document document = saxReader.read(fis);
			
		
		driver.get(document.selectSingleNode("//login_detail/url").getText());
		
		Thread.sleep(3000);
		
		driver.findElement(By.name(document.selectSingleNode("//login_detail/username").getText())).sendKeys("Admin");
		driver.findElement(By.name(document.selectSingleNode("//login_detail/password").getText())).sendKeys("admin123");
		driver.findElement(By.xpath(document.selectSingleNode("//login_detail/loginButton").getText())).click();
		
		String msg=document.selectSingleNode("//login_detail/welcome").getText();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(msg)));
				
		System.out.println("Greeting!! "+driver.findElement(By.xpath(msg)).getText());
		
		driver.close();
		System.out.println("Successfully read key values from xml file!!");
	}

	}
