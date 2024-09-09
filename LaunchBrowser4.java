package week3.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser4 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gopikrishnan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gopal");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gopi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("krishna");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Softwaretester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5,00,000");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9943764598");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gopi10042000@gmail.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Ariyalur");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Kallakurichi");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("605801");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		if (title.contains("Lead")) {
			System.out.println("verified");
		} else {
			System.out.println("not verified");
		}

	}

}
