package _2_Session;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptDemo {

	WebDriver driver;
	WebDriverWait wait;
	JavaScriptUtils javascriptutil;
	String Url ="https://www.google.com";
	
	
	@Before
	
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Url);
		wait = new WebDriverWait(driver, 15);
		javascriptutil = new JavaScriptUtils(driver);
		
	}
	
	
	@Test
	public void tc_01() throws InterruptedException
	
	{
		WebElement searchBox = driver.findElement(By.name("q"));
		
		javascriptutil.DrawBorder(searchBox);
		//javascriptutil.flash(searchBox);
		
		
		searchBox.sendKeys("Selenium");
		
		WebElement searchButton = driver.findElement(By.name("btnK"));
		javascriptutil.ClickElementByJs(searchButton);
		
		String Pagetile = javascriptutil.getTitleByJS();
		System.out.println("Current Page Title is : " + Pagetile);
		
		
		javascriptutil.GenerateAlert("Current Page Title is : " + Pagetile);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		wait.until(ExpectedConditions.titleContains("Selenium"));
		
//WebElement javatpointLink = driver.findElement(By.xpath("//h3[contains(text(),'Selenium Tutorial for Beginners: Learn WebDriver in 7 Days')]"));
		
		//wait.until(ExpectedConditions.elementToBeClickable(javatpointLink));
		
		//javatpointLink.click();
	}
		
		

	}
	
	
	
