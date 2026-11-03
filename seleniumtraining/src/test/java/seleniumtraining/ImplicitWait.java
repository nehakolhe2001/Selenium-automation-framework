package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='ORAL B']")).click();
		driver.findElement(By.id("check Delivery")).sendKeys("411033");
		//driver.findElement(By.id("check")).click();
	}

}
