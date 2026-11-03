package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class Scrollfromorigin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement searchTextField =driver.findElement(By.id("//input[@value='Search store']"));
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		act.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(searchTextField), 0, 500);
	}

}
