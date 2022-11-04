package DataDrivenTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import au.com.bytecode.opencsv.CSVReader;

public class SearchProduct {

	static String driverPath = "C:\\Users\\LavanyaJyothi\\OneDrive - Hallmark Health Care Solutions, Inc\\Desktop\\Selenium Web\\Web Driver\\chromedriver_win32\\chromedriver.exe";
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",driverPath);			
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		CSVReader reader = new CSVReader(new FileReader("./TestResources/Product.csv"));
		 
		 // this will load content into list
		  java.util.List<String[]> li=reader.readAll();
		  System.out.println("Total rows that we have is "+li.size());
		            
		 // create Iterator reference
		  Iterator<String[]>i1= li.iterator();
		    
		 // Iterate all values 
		 while(i1.hasNext()){
			 String[] str=i1.next();
		 
			 driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys(str[0]);
			 driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
			 Thread.sleep(3000);
			 
			 driver.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/a/img")).click();
			 Thread.sleep(3000);
			 driver.navigate().back();
			 driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).clear();
		 }	   
		 driver.close();
		}
}
