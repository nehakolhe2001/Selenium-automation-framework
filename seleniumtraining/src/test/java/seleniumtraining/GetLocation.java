package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1/");
		Thread.sleep(2000);
		WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
		//find the location
		Point registerLocation = registerButton.getLocation();
		System.out.println(registerLocation);
		//fetch the x coordinate out the located element
		System.out.println("the x coordinate is:"+registerLocation.getX());
		
		//fetch the x coordinate out the located element
		System.out.println("the x coordinate is:"+registerLocation.x);
		
		//fetch the y coordinate out the located element
				System.out.println("the y coordinate is:"+registerLocation.getY());
				
				System.out.println("the Y coordinate is:"+registerLocation.y);
				driver.quit();
				
				
				
		
	}

}
