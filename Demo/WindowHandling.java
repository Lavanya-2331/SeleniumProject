package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Web Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/LavanyaJyothi/OneDrive%20-%20Hallmark%20Health%20Care%20Solutions,%20Inc/Desktop/Selenium%20IDE/HTML%20Pages/WindowHandle.html");
        Thread.sleep(2000);
        System.out.println(driver.getPageSource());
        String parentwindow = driver.getWindowHandle().toString();
        
        driver.findElement(By.name("Open")).click();
        driver.findElement(By.xpath("/html/body"));
        
        driver.switchTo().window("PoppWindow");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Lavanya Jyothi linkedin");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
        
        
        driver.close();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
        Thread.sleep(2000);
        driver.switchTo().window(parentwindow);
        driver.close();
        
	}

}
