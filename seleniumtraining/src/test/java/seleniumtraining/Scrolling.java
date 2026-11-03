package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(8000);
		//scrolling to element
		Actions actions=new Actions(driver);
		actions.scrollToElement(driver.findElement(By.linkText("facebook"))).perform();
		//scrolling by amount 
		actions.scrollByAmount(0, -400).perform();
	}

}
