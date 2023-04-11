package Take.Screenshot.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyWith_screenshit {

	WebDriver driver;
	@BeforeTest
	public void Open()
	{
		driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("/practice-test-login/"));
	}
	
	@Test
	public void invalid_Credentials() throws IOException
	{
		driver.findElement(By.name("username")).sendKeys("jdewnkr");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		WebElement ele = driver.findElement(By.id("error"));
		if(ele.isDisplayed())
		{
			TakesScreenshot tk = (TakesScreenshot)driver;
			File file = tk.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./Screenshot/Image2.png"));
		}
		
	}
}
