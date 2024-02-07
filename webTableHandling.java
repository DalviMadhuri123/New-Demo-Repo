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

public class webTableHandling {
	WebDriver driver;
	
	@Before
	
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		
	}

	@Test
	
	public void WebTablehandle()
	
	{
		
		List<WebElement> pricefromTableListElement = driver.findElements(By.xpath("//th[text()=\"Price\"]//ancestor::table[@id=\"shopping\"]//tr/td[2]"));		
		WebElement FinalPriceElement = driver.findElement(By.xpath("//i[text()=\"Total\"]//parent::td//following-sibling::td/b"));
		
		int sum = 0;
		 
		for(int i = 0 ; i<pricefromTableListElement.size(); i++)
			
		{
			
			sum += Integer.parseInt(pricefromTableListElement.get(i).getText());
			
		}
		
		if (sum == Integer.parseInt(FinalPriceElement.getText()) )
		{
		Assert.assertTrue(true);
		System.out.println("Total iS Matching");
		}
		else
			
		{
		
			Assert.assertTrue(false);
			System.out.println("Total iS not Matching");
			
	}
	}
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}


}
