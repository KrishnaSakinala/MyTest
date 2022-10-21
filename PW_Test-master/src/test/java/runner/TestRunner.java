package runner;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions( monochrome = true,
        features = "src/test/resources/features/",
        glue = {"stepdefinitions"},
        plugin = {"pretty", "junit:target/junitreport.xml", "json:target/jsonreport.json", "html:target/cucumber-reports.html",
        }//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        )

@Listeners({ExtentITestListenerClassAdapter.class})
public class TestRunner extends AbstractTestNGCucumberTests {

    private TestRunner() {

    }
	 
}