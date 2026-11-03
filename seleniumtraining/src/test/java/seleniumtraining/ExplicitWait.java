package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {



	public static void main(String[] args )  {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

				driver.get("https://www.shoppersstack.com/");
				
				driver.findElement(By.xpath("//span[text()='ORAL B']")).click();
				driver.findElement(By.id("check Delivery")).sendKeys("411033");
	 
				WebElement checkPinButton = driver.findElement(By.id("check"));
				//add conditional wait for the element (check if it is clickable)
				WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(7));
				wait.until(ExpectedConditions.elementToBeClickable(checkPinButton));
				checkPinButton.click();
	}

}
