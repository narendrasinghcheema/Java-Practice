package DataDriven.framwork.practice.com;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Instappy_dataDriven {

	WebDriver driver;
	
	@Test(dataProvider = "PassDataTothefileds")
	public void Credentials(String username, String password) throws InterruptedException, IOException
	{
	//	------------------------------Open URL----------------------------
		driver = new FirefoxDriver();
		driver.get("http://35.84.250.98/login");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		assertTrue(url.contains("/login"));
		
		// ------------------------------Pass data credentials---------------------------------
		driver.findElement(By.name("EmailID")).sendKeys(username);
		driver.findElement(By.id("registerPassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		
		if(url.contains("/login"))
		{
			TakesScreenshot tk = (TakesScreenshot)driver;
			File file = tk.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./Screenshot/InvalidData.png"));
		}
		if(url.contains("/my-apps"))
		{
			TakesScreenshot tk = (TakesScreenshot)driver;
			File file = tk.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./Screenshot/ValidData.png"));
		}
	}
	
	@DataProvider(name = "PassDataTothefileds")
	public Object[][] passData_TO_Fields()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0] = "pulpqa7@gmail.com";
		data[0][1] = "Narendra@123";
		
		data[1][0] = "pulpqa10@gmail.com";
		data[1][1] = "Narendra@123";
		return data;	
	}
	
	@AfterTest
	public void tearDiwn()
	{
		driver.close();
	}
	
}
