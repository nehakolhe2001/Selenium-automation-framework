package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
		//search box and type "Dress"
		 WebElement searchBox = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
	        searchBox.sendKeys("Dress");

	        Thread.sleep(2000);
	        //  Click on one suggestion
	        WebElement suggestion = driver.findElement(By.xpath("(//li[contains(@class,'desktop-suggestion')])[1]"));
	        suggestion.click();

	        Thread.sleep(2000);

	        //  Click on Search button
	        WebElement searchButton = driver.findElement(By.cssSelector("a.desktop-submit"));
	        searchButton.click();

	        Thread.sleep(5000);

	        //  Close browser
	        driver.quit();
	}

}
