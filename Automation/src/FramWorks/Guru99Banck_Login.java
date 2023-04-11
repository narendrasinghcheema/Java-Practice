package FramWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Banck_Login {

	By User_name = By.name("uid");
	By Pass_owrd = By.name("password");
	By Submit_Buttone = By.name("btnLogin");
	WebDriver driver;
	
	
	public Guru99Banck_Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void UserNameAndP_Password()
	{
		driver.findElement(User_name).sendKeys("mngr476338");
		driver.findElement(Pass_owrd).sendKeys("nyhymd");
	}
	
	public void click()
	{
		driver.findElement(Submit_Buttone).click();
	}
}
//mngr476338
//nyhymUd