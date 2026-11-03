package seleniumtraining;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.cricbuzz.com/");

        Thread.sleep(3000);

        // Creating timestamp
        String timeStamp1 = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

        TakesScreenshot ts = (TakesScreenshot) driver;

        File temp = ts.getScreenshotAs(OutputType.FILE);

        File prem = new File(
                "C:\\Users\\qspiders wakad\\Documents\\SS\\image"
                        + timeStamp1 + ".png");

        FileHandler.copy(temp, prem);

        // Navigate to Amazon
        driver.navigate().to("https://www.amazon.in/");

        Thread.sleep(3000);

        // Creating timestamp
        String timeStamp2 = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

        // Taking the screenshot
        File source = ts.getScreenshotAs(OutputType.FILE);

        File target = new File(
                "C:\\Users\\qspiders wakad\\Documents\\SS\\image"
                        + timeStamp2 + ".png");

        FileHandler.copy(source, target);

        driver.quit();
    }
}