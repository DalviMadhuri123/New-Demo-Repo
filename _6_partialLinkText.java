package _2_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _6_partialLinkText {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver", "C:\\Users\\madhu\\eclipse-workspace\\Batch18WebDriver\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://dzone.com/articles/find-elements-with-link-text-amp-partial-link-text");

			
			WebElement linkForIdLocator = driver.findElement(By.partialLinkText("Name locator"));
			
			linkForIdLocator.click();
			
 Thread.sleep(2000);
			 
			 driver.quit();
			
}
}