package AutoPOM;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.Assert;
 import org.testng.annotations.BeforeTest;
 import org.testng.annotations.Test;



public class APTest
 {
 String driverPath = "C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Web Driver\\\\chromedriver_win32\\\\chromedriver.exe";
     
     WebDriver driver;



    APLoginPage objLoginPage;



    APHomePage objHomePage;
     
     APSignIn objSignInPage;



    @BeforeTest



    public void setup(){



    System.setProperty("webdriver.chrome.driver", driverPath);
         
         driver = new ChromeDriver();



        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



        driver.get("http://automationpractice.com/index.php");



    }



    
     @Test(priority=0)



    public void test_Home_Page_Appear_Correct(){
         
     objSignInPage = new APSignIn(driver);
     objSignInPage.clickLogin();
    



    objLoginPage = new APLoginPage(driver);
     objLoginPage.loginToAP(driverPath, driverPath);
     
     
  
     objHomePage = new APHomePage(driver);
     objHomePage.getHomePageDashboardUserName();
     



    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().matches(".*"));
     driver.close();
     }
         
 }