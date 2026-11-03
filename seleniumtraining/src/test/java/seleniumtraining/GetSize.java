package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(4000);
		WebElement searchTextField = driver.findElement(By.id("searchInput"));
		Dimension dim = searchTextField.getSize();
		System.out.println("Dimension of the element is:"+dim);
		System.out.println("height of the element is:"+dim.getHeight());
		System.out.println("height of the element is:"+dim.height);
		
		System.out.println("width of the element is:"+dim.getHeight());
		System.out.println("width of the element is:"+dim.height);
		driver.quit();
		

	}

}
