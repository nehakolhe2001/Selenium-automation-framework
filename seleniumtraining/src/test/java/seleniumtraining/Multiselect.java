package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/books");
		Thread.sleep(2000);
		Select sortByDropdown=new Select(driver.findElement(By.id("products-orderby")));
		
		if(sortByDropdown.isMultiple()) {
			System.out.println("the drop down is multi-select");
			System.out.println(sortByDropdown.isMultiple());
		} else {
			System.out.println("the dropdown is single-select");
			System.out.println(sortByDropdown.isMultiple());
		}
		
	}

}
