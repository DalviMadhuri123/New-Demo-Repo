package _2_Session;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ValidateCsscolourOfElement {
	
	
WebDriver driver;

 final String  FbbLoginBtnColour = "#1877f2";
 final String  FbbLoginBtnSize = "20px";
 
 @Before
 public void SetUp()
 {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	
 }
 @Ignore
 @Test
 public void testcolourofElement()
 {
	 WebElement LoginBtnElement = driver.findElement(By.name("login"));
	 
	 System.out.println(" The Color of login Btn is " +LoginBtnElement.getCssValue("background-color"));
	 
	 String ActualValueofElement = LoginBtnElement.getCssValue("background-color");
	 
	 
	 System.out.println(" Sfter convering Rgb value of login btn to hex "  +rgbToHexValue(ActualValueofElement));
	 
	 Assert.assertEquals("The colour for \"Login\" button is not matching with expected value.",FbbLoginBtnColour, rgbToHexValue(ActualValueofElement));
	 
	}
 @Test
 public void testSizeofElement()
 {
	 WebElement LoginBtnElement = driver.findElement(By.name("login"));
	 
	 System.out.println(" Size of login page btn is  " +   LoginBtnElement.getCssValue("font-size"));
	 
	 String ActualLoginBtnSize = LoginBtnElement.getCssValue("font-size");
	 
	 Assert.assertEquals("Size of Login page button is not matching",ActualLoginBtnSize, FbbLoginBtnSize);
 
 
 
 }
 
 
 public static String rgbToHexValue(String rgbvalue)
 {
	 return Color.fromString(rgbvalue).asHex();
 }
 
 
 
	

 @After
 public void teardown() throws InterruptedException
 {
 	// To Halt the execution for sometime (demonstration purposes)
 	Thread.sleep(3000);
 	driver.quit();

 }
 
 
 
 



}
