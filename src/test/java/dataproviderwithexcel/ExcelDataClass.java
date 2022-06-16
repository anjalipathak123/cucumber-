package dataproviderwithexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataClass {
	
	
	public static  Object[][] sendData () throws Exception 
	{
		 XSSFWorkbook wb;
		 XSSFSheet sheet;
		 String data[][];
		FileInputStream inpFile;
		String path="C:\\Users\\Anjalip\\Downloads\\MyWorkBook.xlsx";
		File file=new File(path);
			inpFile = new FileInputStream(file);
		
			wb=new XSSFWorkbook(inpFile);
		
		sheet=wb.getSheetAt(0);
		data=new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
		
		
		
	}

}
