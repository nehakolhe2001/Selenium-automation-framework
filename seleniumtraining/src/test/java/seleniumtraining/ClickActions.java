package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		Thread.sleep(2000);
		WebElement infoIcon = driver.findElement(By.cssSelector("[class='w-5 h-5 mt-5 ml-3 cursor-pointer' ]"));
		//hover over the info icon
		 Actions action=new Actions(driver);
		 action.moveToElement(infoIcon).perform();
		
		 
	}

}
