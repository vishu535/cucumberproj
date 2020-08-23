package steps;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import utilities.ExtentReport;
import utilities.PropertiesReader;
import utilities.Selcommands;
import utilities.base.*;

public class Step_Login001 extends Elementhub {
	
	WebDriver driver;
	
	Selcommands selcommands = new Selcommands(driver);
	@Given("^open restoration hardware application$")
	public void open_restoration_hardware_application() throws FileNotFoundException{
		selcommands.openbrowser(PropertiesReader.propertiesReader("url"));
	}

	@When("^click signin and enter user details$")
	public void click_signin_and_enter_user_details(){
		selcommands.clickElement(signinlink, "signlink");
		
	}

	@Then("^homepage should be displayed$")
	public void homepage_should_be_displayed(){
		
	}

	@Then("^logout from the application$")
	public void logout_from_the_application(){
		
	}

	@Then("^click all the submenu links$")
	public void click_all_the_submenu_links(){
		
	}

}
