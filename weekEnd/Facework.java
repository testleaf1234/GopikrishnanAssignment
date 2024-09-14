package week3.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facework {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		// Load the URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		// Click on Create New Account Button

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gopi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("G");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9943764598");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("gopi1004!!");
		driver.findElement(By.xpath("//select[@name='birthday_day']//option[10]")).click();
		driver.findElement(By.xpath("//select[@name='birthday_month']//option[4]")).click();
		driver.findElement(By.xpath("//option[text()='2000']")).click();
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();

	}
}
