package OHRM;



import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AddEmployee
{

            public static void main(String[] args) {


           System.setProperty("webdriver.chrome.driver","C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Web Driver\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
            driver.get(baseUrl);
            
            System.out.println("Hello Paul Collings");
            
            
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
            
            driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]")).click();
            
            driver.findElement(By.name("firstName")).sendKeys("Lavanya");
            driver.findElement(By.name("middleName")).sendKeys("Jyothi");
            driver.findElement(By.name("lastName")).sendKeys("Nalluri");
            
            
           driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i")).click();
           WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i"));
           uploadElement.click();
           uploadElement.sendKeys("C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Lavanya Jyothi.jpg");
           //driver.findElement(By.id("btnSave")).click)
          
    }



}