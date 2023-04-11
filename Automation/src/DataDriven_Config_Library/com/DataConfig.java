package DataDriven_Config_Library.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataConfig {

	XSSFWorkbook WK ;
	XSSFSheet sheet1;
	
	public DataConfig(String Pathfor_ExcelSheet) throws IOException
	{
		

		File file = new File(Pathfor_ExcelSheet);
		FileInputStream fileInput = new FileInputStream(file);
		
		WK = new XSSFWorkbook(fileInput);
		
		
		
		
	}
	
	public String getDataSheet(int SheetNumber, int row, int Column )
	{

		// ---------it will read the first sheet inside the Excel Sheet---------------
		sheet1 = WK.getSheetAt(0);
		String Data = sheet1.getRow(row).getCell(Column).getStringCellValue();
		return Data;
		
	}
}
