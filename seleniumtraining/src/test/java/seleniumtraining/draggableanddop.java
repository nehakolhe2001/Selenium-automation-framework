package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draggableanddop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
	
		Thread.sleep(2000);
		WebElement mobileCharger = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement mobileCover = driver.findElement(By.xpath("//div[.='Mobile Cover']") );
        WebElement mobile = driver.findElement(By.xpath("//div[.='Mobile Accessories']"));

        Actions act = new Actions(driver);

        
		// Drag Mobile Charger and drop into Mobile Accessories
        act.clickAndHold(mobileCharger).release(mobile).perform(); 
        

        Thread.sleep(2000);

        // Drag Mobile Cover and drop into Mobile Accessories
        act.dragAndDrop(mobileCover, mobile)
           .perform();

        Thread.sleep(2000);

        driver.quit();
	}

}
