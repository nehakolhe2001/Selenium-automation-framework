package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAccessibleName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		//search button
		WebElement buttonElement = (WebElement) driver.findElements(By.cssSelector("[value='Search']"));
		System.out.println(buttonElement.getAccessibleName());
		//excellent radio button 
		WebElement radioElement = driver.findElement(By.id("pollanswers-1"));
		System.out.println(radioElement.getAccessibleName());
		driver.quit();
	}

}
