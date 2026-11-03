package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nasa.gov/");
		Thread.sleep(3000);
		WebElement heading = driver.findElement(By.cssSelector("[class=\"heading-36 margin-0\"]"));
		//visible text
		System.out.println("the inner text of the heading is:"+ heading.getText());
		//name of the tag
		System.out.println("the name of the tag of the heading is :" + heading.getTagName());



	}

}
