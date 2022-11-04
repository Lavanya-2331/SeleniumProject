package OhrmPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRMTest {

String driverPath = "C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Web Driver\\geckodriver-v0.32.0-win64\\geckodriver.exe";
    
    WebDriver driver;

    OHRMLoginPage objLoginPage;

    OHRMHomePage objHomePage;

    @BeforeTest

    public void setup(){

	System.setProperty("webdriver.gecko.driver", driverPath);
        
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    /**

     * This test case will login in https://opensource-demo.orangehrmlive.com/

     * Login to application

     * Verify the home page using Dashboard message

     */

    @Test(priority=0)

    public void test_Home_Page_Appear_Correct(){

     //Create Login Page object

    objLoginPage = new OHRMLoginPage(driver);

    //login to application

    objLoginPage.loginToOHRM("Admin", "admin123");

    // go the next page

    objHomePage = new OHRMHomePage(driver);

    //Verify home page

    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().matches(".*"));
    driver.close();
    }
}
