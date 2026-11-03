package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickmovetowebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		Thread.sleep(2000);
		//locate the box
		WebElement trackerBox = driver.findElement(By.id("mouse-tracker"));
		Actions act=new Actions(driver);
		act.moveToElement(trackerBox).perform();
		System.out.println(driver.findElement(By.id("relative-location")).getText());
		System.out.println(driver.findElement(By.xpath("//strong[contains(.,'Relative')]")).getText());
		Thread.sleep(2000);
		act.moveToElement(trackerBox, 20, 0).perform();
		System.out.println(driver.findElement(By.xpath("//strong[contains(.,'Relative')]")).getText());
	}

}
