package AutomationPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Register {

   public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Web Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "http://automationpractice.com/index.php";
        driver.get(baseUrl);
        
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        
        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("lavanya321@yopmail.com");
        //driver.findElement(By.id("authentication")).click();
        driver.findElement(By.id("SubmitCreate")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        if(driver.findElement(By.xpath("//h1[contains(text(),'Create an account')]")).isDisplayed()) {
            System.out.println("The confirmation message says- "+driver.findElement(By.xpath("//h1[contains(text(),'Create an account')]")).getText());
            //System.out.println("Hello");
            WebElement radMr=driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
            WebElement radMs=driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
            
            radMs.click();
            
            driver.findElement(By.id("customer_firstname")).sendKeys("Lavanya");
            driver.findElement(By.id("customer_lastname")).sendKeys("D");
            driver.findElement(By.id("passwd")).sendKeys("Aszx@123");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));    
            Select date= new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
            date.selectByValue("23");
                    
            Select months= new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
            months.selectByIndex(7);
            
            Select years= new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
            years.selectByValue("1976");
            
            
            WebElement chk1=driver.findElement(By.xpath("//input[@id='newsletter']"));
            chk1.click();
            driver.findElement(By.id("firstname")).clear();
            driver.findElement(By.id("firstname")).sendKeys("Lavanya");
            driver.findElement(By.id("lastname")).clear();
            driver.findElement(By.id("lastname")).sendKeys("D");
            
            driver.findElement(By.id("address1")).sendKeys("1234");
            driver.findElement(By.id("city")).sendKeys("Orange");
            Select state= new Select(driver.findElement(By.id("id_state")));
            state.selectByIndex(5);
            driver.findElement(By.id("postcode")).sendKeys("92705");
            driver.findElement(By.id("phone_mobile")).sendKeys("9885134288");
            
            driver.findElement(By.id("submitAccount")).click();
            driver.close();
        }
        else
        {
            driver.navigate().refresh();



       }
        
    
        
        
    }



}