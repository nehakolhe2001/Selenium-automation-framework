package seleniumtraining;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauseDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://www.saucedemo.com/inventory.html");
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        
			        driver.findElement(By.id("password")) .sendKeys("secret_sauce");

			        // Click Login
			        driver.findElement(By.id("login-button")).click();

			        Thread.sleep(2000);

			        // Add Product to Cart
			        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
			                .click();

			        Thread.sleep(2000);

			        driver.findElement(By.className("shopping_cart_link"))
			                .click();

	        		
	        
	        


	}

}
