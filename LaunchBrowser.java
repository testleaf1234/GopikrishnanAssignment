package week3.Day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(" http://leaftaps.com/opentaps/control/main");

		String title = driver.getTitle();

		if (title.contains("Leaftaps")) {

			System.out.println("title is verifird");

		} else {

			System.out.println("title is not verifiedd");

		}
		

		driver.close();
	}

}
