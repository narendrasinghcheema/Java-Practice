package DataDriven.framwork.practice.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDLLogin {
	public static void main(String[] args) throws IOException
	{

	File file = new File("G:\\DDT.xlsx");
	FileInputStream fileInput = new FileInputStream(file);
	
	XSSFWorkbook WK = new XSSFWorkbook(fileInput);
	
	// ---------it will read the first sheet inside the Excel Sheet---------------
	XSSFSheet sheet1 = WK.getSheetAt(0);
	
	
	String Data0 = sheet1.getRow(0).getCell(3).getStringCellValue();
	System.out.println("data from Excel sheet is = "+Data0);
}
}
