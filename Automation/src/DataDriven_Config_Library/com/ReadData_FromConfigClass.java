package DataDriven_Config_Library.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadData_FromConfigClass {

	@Test(dataProvider = "DataRead-fromExcel")
		public void Open(String username, String Password)
		{
			WebDriver driver = new FirefoxDriver();
			driver.get("http://35.84.250.98/login");
			driver.manage().window().maximize();
			driver.findElement(By.name("EmailID")).sendKeys(username);
			driver.findElement(By.id("registerPassword")).sendKeys(Password);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
		}
	
	@DataProvider (name = "DataRead-fromExcel")
	public Object[][] data() throws IOException
			{
		DataConfig sheetRead = new DataConfig("G:\\DDT.xlsx");
		int row=0;
		Object[][] data = new Object[row][2];
		for(int i=0;i<row;i++)
		{
			data[i][0] = sheetRead.getDataSheet(0, i, 0);
			data[i][1] = sheetRead.getDataSheet(0, i, 1);
		}
		return data;
		
			}
		
	}

