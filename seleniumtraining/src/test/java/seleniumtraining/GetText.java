package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nasa.gov/");
		Thread.sleep(2000);
		String headingText = driver.findElement(By.cssSelector("[class='heading-22']")).getText();
		 System.out.println(headingText);
		 driver.quit();

	}

}
