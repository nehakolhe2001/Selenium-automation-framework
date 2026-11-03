package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pausetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(8000);
		WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));
		Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.cssSelector(""))).pause(3000)
		.scrollByAmount(0, -5000).pause(Duration.ofSeconds(2)).sendKeys(searchfield,"mobile").perform();
	}

}
