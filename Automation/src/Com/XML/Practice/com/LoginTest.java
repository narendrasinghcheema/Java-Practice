package Com.XML.Practice.com;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import graphql.Assert.*;

public class LoginTest {

	WebDriver driver;
	@BeforeTest
	public void Open_the_Browser()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void Hit_the_URL()
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		assertTrue(url.contains("practice-test-login/"));
	}
	
	@Test
	public void Credentials()
	{
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
	}
	
	@AfterTest
	public void quite()
	{
		driver.quit();
	}
	
}
