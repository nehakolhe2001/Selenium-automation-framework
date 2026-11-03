package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("pollanswers-1"))).
		click().pause(3000).keyDown(Keys.TAB).keyUp(Keys.TAB).pause(2000)
		.sendKeys(Keys.ENTER).perform();
	}

}
