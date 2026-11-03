package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmTest {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//login
		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password"))
		      .sendKeys("admin123", Keys.ENTER);

		driver.findElement(By.linkText("PIM")).click();
		//ENTER
		WebElement empTextField = driver.findElement(
			    By.xpath("//label[.='Employee Name']/following::input[1]"));

			empTextField.sendKeys("a");

			WebElement suggestions1 = driver.findElement(
			    By.xpath("//div[@role='listbox']"));


		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(suggestions1));

		Actions act = new Actions(driver);

		Thread.sleep(4000);

		act.keyDown(Keys.DOWN).keyDown(Keys.ENTER) .perform();

}
}