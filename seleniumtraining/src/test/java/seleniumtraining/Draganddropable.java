package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		Thread.sleep(3000);
		WebElement draggable = driver.findElement(By.id("draggable"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(draggable, 370, 0).perform();
		Thread.sleep(3000);
		act.dragAndDropBy(draggable, 0, 200).perform();
		Thread.sleep(3000);
		act.dragAndDropBy(draggable, -400, 0).perform();
	}

}
