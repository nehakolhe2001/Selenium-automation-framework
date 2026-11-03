package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		Thread.sleep(3000);
		//locate the host of the shadow 
		WebElement shadowHost = driver.findElement(By.xpath("//form//div[1]"));
		//how access the shadow root using the host
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		//locate the element using shadow root 
		shadowRoot.findElement(By.cssSelector("[placeholder='Enter your username']")).sendKeys("neha");
		Thread.sleep(3000);
		
		shadowRoot.findElement(By.cssSelector("[placeholder='Enter your password']")).sendKeys("neha123");
		
		
	}

}
