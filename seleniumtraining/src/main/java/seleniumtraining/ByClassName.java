package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				Thread.sleep(2000);
				//type automationin the search next field
				driver.findElement(By.className("")).sendKeys("automation");
}
}