package week3.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser2 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(" https://www.facebook.com/login");

		driver.findElement(By.id("email")).sendKeys("9943764598");

		driver.findElement(By.id("pass")).sendKeys("Mardhal1234");
		
		driver.findElement(By.id("loginbutton")).click();
		
		
	}

}
