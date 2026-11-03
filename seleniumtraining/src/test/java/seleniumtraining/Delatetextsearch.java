package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delatetextsearch {

    public static void main(String[] args) {

        String inputText = "Levis Shirt";

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");

        // Select product
        driver.findElement(
                By.xpath("//td[.='Levis Shirt']/..//input")).click();

        // Click Delete button
        driver.findElement(By.id("deleteButton")).click();

        // Handle Prompt Alert
        Alert popup = driver.switchTo().alert();
        

        popup.sendKeys(inputText);

        popup.accept();

        // Verify product is deleted
        String displayedText = driver.findElement(
                By.xpath("//div[@class='relative shadow-md sm:rounded-lg']//section")
        ).getText();

        if (displayedText.equals(inputText)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        driver.quit();
    }
}