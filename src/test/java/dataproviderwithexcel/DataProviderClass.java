package dataproviderwithexcel;

import org.testng.annotations.DataProvider;

public class DataProviderClass {


  @DataProvider(name="readDataFromExcel")
  public Object[][] dp() throws Exception  {
	  
	  Object[][] data=ExcelDataClass.sendData();

	  return data;
  }
}
