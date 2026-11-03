package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1/");
		Thread.sleep(2000);
WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
		//fetch the Rectangle
		Rectangle registerRectangle = registerButton.getRect();
		//FETCH DIMENSION
		System.out.println("The Dimension is:"+registerRectangle.getDimension());
		//fetch location
		System.out.println("the location is:"+ registerRectangle.getPoint());
		//fetch height
		System.out.println("the height is:"+ registerRectangle.getHeight());
		System.out.println("the height is:"+ registerRectangle.height);
		// fetch width
		System.out.println("the widtth is:"+ registerRectangle.getWidth());
		System.out.println("the width is:"+ registerRectangle.width);
		// fetch x
		System.out.println("the x is"+ registerRectangle.getX());
		System.out.println("the x is"+ registerRectangle.x);
		// fetch Y
		System.out.println("the Y is:"+ registerRectangle.getY());
		System.out.println("the Y is:"+ registerRectangle.y);
		driver.quit();
		
		

	}
}