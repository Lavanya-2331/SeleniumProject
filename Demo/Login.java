package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {


		@Test
		public void ApLogin() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Web Driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    
	    String baseUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	    driver.get(baseUrl);
	    driver.findElement(By.id("email")).sendKeys("hgdyrtyggy@gmail.com");
	    driver.findElement(By.id("passwd")).sendKeys("Naveen@123");
	    
	    driver.findElement(By.id("SubmitLogin")).click();
	    if(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).isDisplayed()){
	    	System.out.println("the confirmation message : "+driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText());
	    }
	    else {
	    	driver.navigate().back();
	    }
	    driver.findElement(By.linkText("Sign out")).click();
	    driver.close();
	    
	    
	}

		
	}
