package seleniumtraining;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmyouube {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        
        driver.manage().window().maximize();

        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        
        driver.findElement( By.cssSelector("href=\'https://www.youtube.com/c/OrangeHRMInc']")).click();
        	

        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
        Set<String> allId = driver.getWindowHandles();
        for (String winId : allId) {

            driver.switchTo().window(winId);

            if (driver.getCurrentUrl().contains("youtube")) {
            	}
            }

	}

}
