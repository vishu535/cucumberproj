package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepsfile {
	WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;
	@Given("^open faballey application$")
	public void open_faballey_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gadwal\\Documents\\automationstuff\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.faballey.com/");
		test.log(Status.PASS, "opened url - https://www.faballey.com/");
		if(driver.findElement(By.cssSelector("#imgcloseload")).isDisplayed())
			driver.findElement(By.cssSelector("#imgcloseload")).click();
			
	}

	@When("^click signup and enter new user details$")
	public void click_signup_and_enter_new_user_details() {
		driver.findElement(By.cssSelector(".striprhtBox ul li:nth-child(3) a")).click();
		driver.findElement(By.cssSelector("input#cust-FirstName")).sendKeys("testauto");
		test.log(Status.INFO, "Entered testauto");
		driver.findElement(By.cssSelector("input#cust-mobileno")).sendKeys("9978955214");
		test.log(Status.INFO, "Entered 9978955214");
		driver.findElement(By.cssSelector("input#cust-email")).sendKeys("testauto@farenheit.com");
		test.log(Status.INFO, "Entered username: ");
		driver.findElement(By.cssSelector("input#cust-pass")).sendKeys("pAkoditesting123");
		test.log(Status.INFO, "Entered password");
		driver.findElement(By.cssSelector(".signBox #btn-register")).click();
		test.log(Status.INFO, "clicked register button");

	}

	@Then("^it should prompt for otp$")
	public void it_should_prompt_for_otp() {
		String text = driver.findElement(By.cssSelector("#frmchange-otpverify h3")).getText();
		Assert.assertEquals("Verify Mobile Number", text);
		driver.close();
	}

	@When("^click cart icon$")
	public void click_cart_icon() {
		driver.findElement(By.cssSelector(".headBagitem>a")).click();
	}

	@Then("^it should prompt to loginto account$")
	public void it_should_prompt_to_loginto_account() {
		String loginlink = driver.findElement(By.cssSelector(".noItembox a")).getText();
		Assert.assertEquals("Login to your account", loginlink);
		driver.close();
	}


}
