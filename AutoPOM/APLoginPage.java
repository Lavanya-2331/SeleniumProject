package AutoPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class APLoginPage {
    



   
        WebDriver driver;
          
        By userName = By.id("email");
        By password = By.id("passwd");
        By login = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]");



       public APLoginPage(WebDriver driver){
            this.driver = driver;
        }



       //Set user name in textbox



       public void setUserName(String strUserName){
        driver.findElement(userName).sendKeys("hgdyrtyggxyz3@gmail.com");
        }



       //Set password in password textbox



       public void setPassword(String strPassword){
        driver.findElement(password).sendKeys("Naveen@123");
        }



       //Click on login button



       public void clickLogin(){
        driver.findElement(login).click();
        }



       public void loginToAP(String strUserName,String strPasword){
        //Fill user name
        this.setUserName("hgdyrtyggxyz3@gmail.com");
        //Fill password
        this.setPassword("Naveen@123");
        //Click Login button
        this.clickLogin();        
        }
    }