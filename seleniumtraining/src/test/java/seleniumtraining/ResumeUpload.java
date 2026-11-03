package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeUpload {

    public static void main(String[] args) {

        
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://example.com");

        
        driver.manage().window().maximize();

        // Find Resume Upload field
        WebElement uploadResume =
                driver.findElement(By.xpath("//input[@type='file']"));

         //Upload Resume
        uploadResume.sendKeys(
                "/Users/sonali/Downloads/Neha_Kolhe_Resume.pdf" );

        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        driver.quit();
    }
}