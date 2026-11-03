package seleniumtraining;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopup {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03cas.vercel.app/");
        Robot robo=new Robot();
        robo.keyPress(KeyEvent.VK_A);
        robo.keyRelease(KeyEvent.VK_A);
        robo.keyPress(KeyEvent.VK_D);
        robo.keyRelease(KeyEvent.VK_D);
        robo.keyPress(KeyEvent.VK_M);
        robo.keyRelease(KeyEvent.VK_M);
        robo.keyRelease(KeyEvent.VK_I);
        robo.keyPress(KeyEvent.VK_I);
        robo.keyPress(KeyEvent.VK_N);
        robo.keyRelease(KeyEvent.VK_N);
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_TAB);

        robo.keyPress(KeyEvent.VK_A);
        robo.keyRelease(KeyEvent.VK_A);

        robo.keyPress(KeyEvent.VK_D);
        robo.keyRelease(KeyEvent.VK_D);

        robo.keyPress(KeyEvent.VK_M);
        robo.keyRelease(KeyEvent.VK_M);

        robo.keyPress(KeyEvent.VK_I);
        robo.keyRelease(KeyEvent.VK_I);

        robo.keyPress(KeyEvent.VK_N);
        robo.keyRelease(KeyEvent.VK_N);

        // Press ENTER
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
        

	}

}
