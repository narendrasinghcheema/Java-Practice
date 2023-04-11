package NG.XML.TEST;

import static org.testng.Assert.assertTrue;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class OrangeHRM_InvalidLoginCredenmtials {
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new FirefoxDriver();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Username = ");
	String UserName = sc.next();
	
	System.out.println("Enter a Password = ");
	String passWord = sc.next();
	
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("practice-test-login/"));
		
		driver.findElement(By.id("username")).sendKeys(UserName);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(passWord);
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='error'][text()='Your password is invalid!']"));
		//WebElement ele1 = driver.findElement(By.xpath("//div[@id='error'][text()='Your username is invalid!']"));
		
		
		if(ele.isDisplayed())
		{
			System.out.println("passowrd is incorrect please check!");
		} else
		{
			System.out.println("user Login successfully");
		}
	
}
}

/*   1. login with invalid credentials
     2. now user will get warning massage
     3. if user will get warning massage then validate it
     4. if user will not get warning massage then user login successfully */