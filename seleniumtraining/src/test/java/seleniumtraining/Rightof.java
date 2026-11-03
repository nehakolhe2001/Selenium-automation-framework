package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Rightof {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//locate about using any locator
		WebElement aboutLink = driver.findElement(By.linkText("About"));
		//locate store with tag =a which is present to the right of about link
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(aboutLink)).click();
		
		
		
	
	}

}
