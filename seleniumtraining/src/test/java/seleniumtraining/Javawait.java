package seleniumtraining;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Javawait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("ss")));
Thread.sleep(3000);
System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("ss")));
Thread.sleep(3000,100);
System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("ss")));
Thread.sleep(Duration.ofSeconds(4));
System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("ss")));

	}

}
