package Com.Perameter.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class InstappyEditApp {

	WebDriver driver;
	@Test
	public void Edit()
	{
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//button[@class='click-btn_edit']")).click();
		
		
	}
}
