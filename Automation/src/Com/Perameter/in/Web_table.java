package Com.Perameter.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Web_table {
	WebDriver driver;
@Test
public void Open()
{
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@Test
public void table()
{
	String st = driver.findElement(By.xpath("//*[@id='customers']//tr[3]//td[2]")).getText();
	System.out.println("text = "+st);
	
	if(st.equals("Francisco Chang"))
	{
		System.out.println("Test is pass");
	} else {
		System.out.println("test is fail");
	}
}
}
