package _2_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_ByName {
	
	public static void main (String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.crome.driver", "C:\\Users\\madhu\\eclipse-workspace\\Batch18WebDriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.co.in/");
	
	WebElement searchTextBox = driver.findElement(By.name("q"));
	searchTextBox.sendKeys("Selenium");
	Thread.sleep(2000);
	 WebElement searchBtn = driver.findElement(By.name("btnK"));
	 searchBtn.click();
	 	 
	 Thread.sleep(2000);
	
	 //
	 String expTitle = "selenium - Google Search";
	 if(expTitle.equals(driver.getTitle())) {
		 System.out.println("Test is Pass");
	 }
		 else 
		 {
			 System.out.println("Test is Fail"); 
		 }
	 Thread.sleep(2000);
	 
	
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	}

}
