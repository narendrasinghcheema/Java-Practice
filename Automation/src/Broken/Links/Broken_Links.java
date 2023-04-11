package Broken.Links;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import graphql.Assert.*;

public class Broken_Links extends Verify_Links{
	
	WebDriver driver;
@BeforeTest
public void Open()
{
	driver = new FirefoxDriver();
	driver.get("https://cardiology.seekmed.care/home/create");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String url = driver.getCurrentUrl();
	assertTrue(url.contains("/create"));
}
@Test
public void Hit()
{
	List<WebElement> ele = driver.findElements(By.tagName("a"));
	//int links = ele.size();
	System.out.println("number of links are listed here :-");
	for(int i=0; i<ele.size(); i++)
	{
		WebElement E1 = ele.get(i);
		String links = E1.getAttribute("href");
		//System.out.println(links);
		verifyLinks(links);
	}
	
}
}
