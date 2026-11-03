package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {

	public static void main(String[] args) {
		//ignoring
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disble-notification");
		WebDriver driver = new ChromeDriver(opt);

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
       driver.findElement(By.id("browNotButton")).click();
	}

}
