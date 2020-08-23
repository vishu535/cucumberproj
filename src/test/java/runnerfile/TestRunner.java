package runnerfile;


import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(plugin = {"cucumberHooks.customReportListener"},
monochrome=true,
features= {"src/test/java/features/"},
tags= {"@rh"},
glue= {"steps"}
 //FolderName
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = true)
	@Override
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
