package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1/");
		Thread.sleep(3000);
		WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
		//font 
		System.out.println("the font family is "+registerButton.getCssValue("Font-Family"));
		//background color
		System.out.println("the colour is "+registerButton.getCssValue("color"));
		driver.quit();

	}

}
