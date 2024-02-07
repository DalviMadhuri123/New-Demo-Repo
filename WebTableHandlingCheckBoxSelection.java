package _2_Session;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandlingCheckBoxSelection {
	WebDriver driver;
	 //String userName = "Koushik";
	 
	 //String userName = "Yashwanth1";
	 String dessertName = "Eclair";
	
	
	@Before
	
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		
	}

//	@Test
//	
//	public void WebTablehandle()
//	{
//	try
//	
//	{
//		WebElement ChheckboxforUser = driver.findElement(By.xpath("//td[text()='"+userName+"']/parent::tr//td[4]/input[@type='checkbox']"));
//		
//		ChheckboxforUser.click();
//		//Assert.assertTrue(ChheckboxforUser.isSelected());
//		System.out.println("Checkbox for user" +userName+ " is selected");
//		
//	}
//	
//	catch(Exception e)
//	{
//		System.out.println("Unable to findout the" +userName+  " :in the table");
//		e.printStackTrace();
//		e.getMessage();
//		
//		
//		
//	}
//	}
	
	@Test
	
	public void WebTablehandle1()
	{
		List<WebElement> desertNutitiveContentBreakupListElement = driver.findElements(By.xpath("//td[text()='"+dessertName+"']/parent::tr[@class=\"ng-star-inserted\"]/td"));
		//List<WebElement> desertNutitiveContentBreakupListElement = driver.findElements(By.xpath("//tr[@class='ng-star-inserted']/td[text()='"+dessertName+"']//following-sibling::td[text()]"));
		
		System.out.println("The nutritional breakup for the desert \""+dessertName+"\" as below");
		
		for(int i=0; i<desertNutitiveContentBreakupListElement.size(); i++)
			
			
		{
			
			
			System.out.println((i+1) +" " +desertNutitiveContentBreakupListElement.get(i).getText());
		}
		}
		
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

	}
	
	

