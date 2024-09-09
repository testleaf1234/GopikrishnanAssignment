package week3.Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Krishna");
		driver.findElement(By.name("lastname")).sendKeys("G");
		driver.findElement(By.name("reg_email__")).sendKeys("gopi10042000@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("gopi1004!!!");
		
		String title = driver.getTitle();
		if (title.contains("Facebook")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}

	}
}