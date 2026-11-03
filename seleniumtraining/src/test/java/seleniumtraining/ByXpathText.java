package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpathText {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(9000);
		driver.findElement(By.name("search_query")).sendKeys("barbaad");
		driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//yt-formatted-string[.='Barbaad Song | Saiyaara | Ahaan Panday, Aneet Padda | The Rish | Jubin Nautiyal']")).click();
		Thread.sleep(10000);
        driver.quit();
	}

}
