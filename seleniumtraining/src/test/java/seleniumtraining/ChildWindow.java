package seleniumtraining;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.shoppersstack.com/");
        driver.findElement(By.id("compare")).click();
       Set<String> allId = driver.getWindowHandles();
       for(String winId : allId) {
    	   Thread.sleep(2000);
    	   driver.switchTo().window(winId);
    	   if(driver.getCurrentUrl().contains("amazon")) {
    		   break;
    	   }
       }
        
driver.close();
	}

}
