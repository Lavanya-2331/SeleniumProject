package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithtoFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Web Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("");
        driver.switchTo().frame("iframeResult");
	}

}
