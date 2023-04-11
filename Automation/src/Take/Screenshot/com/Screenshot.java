package Take.Screenshot.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
public static void main(String[] args) throws IOException
{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("username")).sendKeys("jdewnkr");
	driver.findElement(By.name("password")).sendKeys("Password123");
	driver.findElement(By.id("submit")).click();
	TakesScreenshot tk = (TakesScreenshot)driver;
	File file = tk.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("./Screenshot/Image1.png"));
	
}
}
