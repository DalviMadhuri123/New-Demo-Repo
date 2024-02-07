package _2_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4_ByClaasNams {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.crome.driver", "C:\\Users\\madhu\\eclipse-workspace\\Batch18WebDriver\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://zero.webappsecurity.com/");
			
			 Thread.sleep(2000);
			 
			 WebElement signInBtn = driver.findElement(By.className("signin"));
			 signInBtn.click();
			 System.out.println("After clicking on signin Submit btn ->" + driver.getTitle());
		
			 Thread.sleep(2000);
			 WebElement userLoginTextBox = driver.findElement(By.id("user_login"));
			 WebElement passTextBox = driver.findElement(By.id("user_password"));
			 WebElement SubmitBtn = driver.findElement(By.name("submit"));
			 
			 userLoginTextBox.sendKeys("username12");
			 passTextBox.sendKeys("password");
			 SubmitBtn.click();
			 
			 Thread.sleep(2000);
			 
			 
			 System.out.println("After clicking on signin Submit btn next page title is ->" + driver.getTitle());
			 
			 String expectedErrMsg = "Login and/or password are wrong.";
			 WebElement actErrorMsg = driver.findElement(By.className("alert-error"));
			  String actErroeMsgText = actErrorMsg.getText();
			 
			 if(expectedErrMsg.equals(actErroeMsgText) )
			 {
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

