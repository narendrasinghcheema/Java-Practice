package Com.Perameter.in;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import graphql.Assert.*;

//<parameter name="Browsername" value="Firefox"/>
//<parameter name="url" value="http://35.84.250.98/dashboard/instappy20221219120556/1"/>

public class Instappy_Login {

	WebDriver driver;
	WebElement ele;
	@BeforeTest
	public void Open()
	{
		driver = new FirefoxDriver();
		driver.get("http://35.84.250.98/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		assertTrue(url.contains("/login"), "Success");
	}
	
	@Test
	public void Login()
	{
		driver.findElement(By.name("EmailID")).sendKeys("pulpqa3@gmail.com");
		driver.findElement(By.id("registerPassword")).sendKeys("Narendra@123");
		driver.findElement(By.id("login_button")).click();
		ele = driver.findElement(By.xpath("//div[@class='app-desc-bx']/h3"));
		if(ele.isDisplayed())
		{
			assertTrue(true);
		}else
		{
			assertTrue(false);
		}
	}
}
