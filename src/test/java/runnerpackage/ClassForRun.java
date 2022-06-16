package runnerpackage;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;



@CucumberOptions(features= {"src/test/java/featurepackage"},glue= {"definitionspackage"},monochrome=true)

public class ClassForRun extends AbstractTestNGCucumberTests{
private TestNGCucumberRunner testNGCucumberRunner; 


@BeforeClass(alwaysRun=true)
public void setUPClass() {
	
testNGCucumberRunner =new TestNGCucumberRunner(this.getClass());

}
@Test
public void runScenarios() {
System.out.println("test is running");
}
@AfterClass
public void afterClass() {
testNGCucumberRunner.finish();
} }




