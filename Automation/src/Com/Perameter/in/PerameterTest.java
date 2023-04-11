package Com.Perameter.in;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import graphql.Assert.*;

public class PerameterTest {

	WebDriver driver;
	WebElement ele;
	
	@Parameters("Browsername")
	@BeforeTest
	public void OpenWindow(String BrowserName)
	{
		switch (BrowserName) 
		{
		case "Chrome": 
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
			
		case "Firefox": 
		
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		    break;
		    
		default:
			System.out.println("wright the correct Browser Name");
		}
	}
	
	@Parameters("url")
	@Test
	public void Open(String url)
	{
		driver.get(url);
		String url1 = driver.getCurrentUrl();
		assertTrue(url1.contains("login"));
	}
	
	//@Parameters({"username","password"})
	@Test(dependsOnMethods = "VerifyuserNow")
	public void VerifyError()
	{
		driver.findElement(By.name("EmailID")).sendKeys("pulpqa3@gmail.com");;
		driver.findElement(By.id("registerPassword")).sendKeys("Narendra@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		ele = driver.findElement(By.xpath("//*[text()='Invalid credentials']"));
		if(ele.isDisplayed())
		{
			assertTrue(true, "check the Name again"); 
		}else
		{
			assertTrue(false);
		}
	}
	
	@Test 
	public void VerifyuserNow()
	{
		driver.findElement(By.name("EmailID")).sendKeys("pulpqa3@gmail.com");
		driver.findElement(By.id("registerPassword")).sendKeys("Narendra@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		ele = driver.findElement(By.xpath("//div[@class='app-desc-bx']//h3"));
		if(ele.isDisplayed())
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
	}
}
