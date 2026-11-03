package seleniumtraining;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class UsingFluentWait {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.shoppersstack.com/");

        driver.findElement(By.xpath("//span[text()='ORAL B']")).click();

        driver.findElement(By.id("check Delivery")) .sendKeys("411033");

        // Object creation of FluentWait
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);

        // Maximum time to wait
        wait.withTimeout(Duration.ofSeconds(10));

        // Frequency to check the condition
        wait.pollingEvery(Duration.ofSeconds(1));

        // Exception to ignore
        wait.ignoring(NoSuchElementException.class);

        // Wait until button is clickable
        WebElement checkPinButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("check")));

        // Click on Check button
        checkPinButton.click();

    }
}