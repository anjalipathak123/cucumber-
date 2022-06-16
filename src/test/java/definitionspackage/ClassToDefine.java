package definitionspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClassToDefine {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;

@Given("^open chrome browser and enter url$")
public void open_chrome_browser_and_enter_url() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	report=new ExtentReports(System.getProperty("user.dir")+ "./Reports/testreport.html");
	test=report.startTest("Maven Project Reports");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjalip\\eclipse-workspace\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("http://www.amazon.com");
	driver.manage().window().maximize();
}

@When("^enter search criteria$")
public void enter_search_criteria() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement searchField=driver.findElement(By.id("twotabsearchtextbox"));
	searchField.sendKeys("watches");

}

@When("^click on search button$")
public void click_on_search_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
searchButton.click();
   
}

@Then("^check more outcomes$")
public void check_more_outcomes() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String watchPageTitle=driver.getTitle();
			System.out.println(watchPageTitle);
		if(watchPageTitle.equals(watchPageTitle))
		{
		  test.log(LogStatus.PASS, "Test Passed");
		}
		else
		{
			 test.log(LogStatus.FAIL, "Test Failed");
		}
		
		report.endTest(test);
		report.flush();
			
   
}
}
