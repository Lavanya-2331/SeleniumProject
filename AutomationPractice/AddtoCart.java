package AutomationPractice;
import java.time.Duration;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AddtoCart {
    public static void main(String args[]) throws Exception {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Web Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("Dresses");
        driver.findElement(By.name("submit_search")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/h5[1]/a[1]")).click();
        Thread.sleep(1000);
        Select s=new Select(driver.findElement(By.id("group_1")));
        s.selectByValue("2");
        Thread.sleep(2000);
        driver.findElement(By.name("Yellow")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
        Thread.sleep(3000);
        

        driver.findElement(By.xpath("//*[@id=\"product\"]")).click();
        
        WebElement check =driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"));
        JavascriptExecutor js =(JavascriptExecutor)driver;
        
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()",check);
      
        
    
        Thread.sleep(1000);
        
        
        
    }



}