package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();

		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		        driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
		        //click on add customer button
		        driver.findElement(By.xpath("//button[text()='add customer']")).click();
		        //enter details in the hidden divison popup
		        driver.findElement(By.id("customerName")).sendKeys("Cname");
		        driver.findElement(By.id("customerEmail")).sendKeys("email");
		      WebElement productDropdown = driver.findElement(By.id("prod"));
		    Select product = new Select (productDropdown);
		    product.selectByValue("mobile");
		    driver.findElement(By.id("message")).sendKeys("description");
		    driver.findElement(By.xpath("//button[text()='submit']")).click();
		    driver.findElement(By.xpath("//td[contains(text(),+email+)"));
		    
			//verification
		    if(newcustomer.getText().contains(email)) {
		    	System.out.println("test case : pass");
		    }else {
		    	System.out.println("test case : Fail");
		    	
		    }
		    
		    
		    
		        
		    

	}

	
	
}
