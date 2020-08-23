package utilities;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;




public class Selcommands{
	WebDriver driver;
	public Selcommands(WebDriver driver) {
		this.driver = driver;
		
}
	
 
	public void openbrowser(String url) throws FileNotFoundException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gadwal\\Documents\\automationstuff\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		Reporter.addStepLog("welcome to "+url);
	}

	public void clickElement(By signinlink, String element) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(signinlink));
		driver.findElement(signinlink).click();
		Reporter.addStepLog("clicked  welcome to ");
	}
	public void enterText(By wb, String text) {
		driver.findElement(wb).sendKeys(text);
	//	Hooks.logger.log(Status.INFO, "Entered text "+text);
	}
}
