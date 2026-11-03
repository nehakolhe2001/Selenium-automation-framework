package seleniumtraining;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test {

    public static void main(String[] args) {

       
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(opt);

       
        FirefoxOptions fopt = new FirefoxOptions();
        fopt.addArguments("-private-window");

        WebDriver fDriver = new FirefoxDriver(fopt);

        // Headless Execution
        ChromeOptions copt = new ChromeOptions();
        copt.addArguments("--headless");

        WebDriver cdriver = new ChromeDriver(copt);

        cdriver.get("https://demoapps.qspiders.com/ui/browserNotSublist?0");

        cdriver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(20));

        System.out.println(cdriver.getTitle());
    }
}