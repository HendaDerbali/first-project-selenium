package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCommands {

	public static void main(String[] args) {

		// Open Chrome By bonigarcia :

		ChromeOptions chromeOptions = new ChromeOptions(); // bonigarcia
		WebDriverManager.chromedriver().setup(); // bonigarcia
		WebDriver driver = new ChromeDriver(chromeOptions); // bonigarcia

		// Open application my store :
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);

		// Maximize Browser :
		driver.manage().window().maximize();

		// Tilte Page :
		String titlePage = driver.getTitle();
		System.out.println("The Title of the page is: " + titlePage);

		// Length of the title
		int titleLength = titlePage.length();
		System.out.println("The lengh of the Title page is: " + titleLength);

		// Verify Title :
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			System.out.println("Verification successfully - The correct url is oppened ");
		} else {
			System.out.println("Verification failed - an uncorrect url is oppened ");
		}
		System.out.println("Actual url is " + actualUrl);
		System.out.println("expected url is " + url);

		// Verify the page source :
		String sourcePage = driver.getPageSource();
		// System.out.println(sourcePage);

		// Length od the Page source :
		int lengthPageSource = sourcePage.length();
		System.out.println(" The Length of The Page Source is " + lengthPageSource);
		
		driver.quit();

	}

}
