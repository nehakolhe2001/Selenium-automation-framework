package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoshoptest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Computrs")).click();
		WebElement sortby = driver.findElement(By.id("priducts-order by"));
		Select select = new Select(sortby);
		select.selectByContainsVisibleText("Name Z to A");
		driver.findElement(By.cssSelector(""));
		
		
		
	}

}
