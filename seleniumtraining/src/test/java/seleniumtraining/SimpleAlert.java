package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        //click on search 
       WebElement searchButton = driver.findElement(By.cssSelector("[value='Search']"));
       searchButton.click();
       Thread.sleep(2000);
       //handling the simple alert popop
       driver.switchTo().alert().accept();
       driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
       searchButton.click();
	}

}
