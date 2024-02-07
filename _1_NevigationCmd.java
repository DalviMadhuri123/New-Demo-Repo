package _2_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_NevigationCmd {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver", System.getProperty("user.dir")+ "/cromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		System.out.println("Title of google page is "+ driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("Title of facebook page is "+ driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Title of google page after back from facebook is "+ driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Title of facebook page after forward from google is "+ driver.getTitle());
		driver.navigate().back();
		System.out.println("Title of google page after back from facebook is "+ driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().to("https://www.linkedin.com/");
		System.out.println("Title of linkedin page is "+ driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Title of google page after back from facebook is "+ driver.getTitle());
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
		
		
		
		
		
	}
	
	
	
	
		
}