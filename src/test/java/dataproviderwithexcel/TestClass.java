package dataproviderwithexcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {
  @Test(dataProvider="readDataFromExcel",dataProviderClass=DataProviderClass.class) 
  public void f(String name,String password,String number) {
	  System.out.println(name+password+number);
  }
  
  
 
}
