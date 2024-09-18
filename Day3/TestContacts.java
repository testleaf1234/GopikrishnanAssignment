package week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContacts {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Gopikrishnan");
		driver.findElement(By.id("lastNameField")).sendKeys("G");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Gopi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("G");
		driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("Selenium");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Automation testing by Gopi krishnan");
		driver.findElement(By.id("createContactForm_importantNote")).sendKeys("Testcontacts");
		driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys("R29HT");
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("9943764598");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("gopi10042000@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.partialLinkText("Edit")).click();

	}

}
