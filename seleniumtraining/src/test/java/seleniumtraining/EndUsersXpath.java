package seleniumtraining;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndUsersXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//type in serch text
		driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in'")).sendKeys("samsung s25 ultra 5g mobile");
		//click on the search button
		driver.findElement(By.xpath("//inpu[@value='Go']")).click();
		//click on the product
		driver.findElement(By.xpath("//h2[contains(@aria-label,'Silverblue')]")).click();
		Thread.sleep(3000);
		//switch the control to the new tab
		String parentWindowId =driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentWindowId);
		for (String childId:allWindowId) {
			//code to switch the tool control
			driver.switchTo().window(childId);
			Thread.sleep(2000);
			break;
		}
		WebElement priceText = driver.findElement(By.xpath("//span[@class"));
		System.out.println(priceText.getText());
		driver.quit();
	}

}
