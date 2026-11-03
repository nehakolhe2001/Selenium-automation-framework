package seleniumtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToLocation(200, 300).perform();
		Thread.sleep(2000);
		act.moveToLocation(400, 500).perform();
		Thread.sleep(2000);
		act.moveToLocation(44, 460).perform();
	}

}
