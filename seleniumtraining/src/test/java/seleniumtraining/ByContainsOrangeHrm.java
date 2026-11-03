package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByContainsOrangeHrm {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		//type username
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		//enter password
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		//login
		driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
		Thread.sleep(4000);
		//click on dropdown
		driver.findElement(By.xpath("//i[contains(@class,'oxd-userdropdown-icon')]")).click();
		//click on logout buton
		driver.findElement(By.xpath("//a[.='Logout']")).click();
	}

}
