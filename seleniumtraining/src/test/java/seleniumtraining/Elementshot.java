package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class Elementshot {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.isro.gov.in/");
        driver.findElement(By.id("close-btn_lang")).click();

        WebElement isroLogo = driver.findElement( By.cssSelector("[alt='ISRO DOS Home']") );
      File success = isroLogo.getScreenshotAs(OutputType.FILE);

      File targetss = new File(
    		    "C:\\Users\\qspiders wakad\\Documents\\ss\\isro.png");
      //  Save screenshot
      FileHandler.copy(success, targetss);

	}

}
