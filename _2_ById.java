package _2_Session;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_ById {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.crome.driver",System.getProperty("user.dir")+ "/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/");
		System.out.println("The landing page title is -> " + driver.getTitle());;
		WebElement emailIdTextBox = driver.findElement(By.id("email"));
		emailIdTextBox.sendKeys("dummy@gmail.com");
		Thread.sleep(2000);
		
		WebElement SubmitBtn = driver.findElement(By.id("enterimg"));
		SubmitBtn.click();
		
		Thread.sleep(2000);
		System.out.println("After clicking on Submit btn ->" + driver.getTitle());
		
		
		driver.quit();
		
	}

}
