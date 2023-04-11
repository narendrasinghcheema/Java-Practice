package FramWorks.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import FramWorks.Guru99Banck_Login;

public class VerifyLogin {

	@Test
	public void VerifyvalidData()
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		
		Guru99Banck_Login data = new Guru99Banck_Login(driver);
		data.UserNameAndP_Password();
		data.click();
		
		WebElement ele = driver.findElement(By.xpath("//*[text()='Manger Id : mngr476338']"));
		if(ele.isDisplayed())
		{
			Assert.assertTrue(true, "user is successfully Login");
		}else if(ele.isEnabled())
		{
			Assert.assertTrue(false, "user is not able to login");
		}
		
	}
}
