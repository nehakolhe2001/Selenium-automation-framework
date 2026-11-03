package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ChainingRelativeLocators {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/ui?scenario=1/");
			Thread.sleep(2000);
			//find name
			  //Find the name text filed
		    WebElement nameTextField = driver.findElement(By.id("name"));

		    //Use the name to locate the EmailId present below the name with tag=input
		    WebElement emailIdTextField = driver.findElement(
		            RelativeLocator.with(By.tagName("input")).below(nameTextField));

		    //Use the emailId text field to locate the Password present below the name
		    WebElement passwordTextField = driver.findElement(
		            RelativeLocator.with(By.tagName("input")).below(emailIdTextField));

		    nameTextField.sendKeys("neha");

		    emailIdTextField.sendKeys("neha@gmail.com");

		    passwordTextField.sendKeys("pass@1234");
			//use the name to locate 
	}

}
