package Saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabslogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		//username
		driver.findElement(By.xpath("//input[starts-with(@data-test,'username')]")).sendKeys("standard_user");
		//pass
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Password')]")).sendKeys("secret_sauce");
		//login button
		driver.findElement(By.xpath("//input[starts-with(@value,'Login')]")).click();
	}

}
