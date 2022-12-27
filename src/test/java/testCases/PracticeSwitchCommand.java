package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open Chrome :
		WebDriver driver = new ChromeDriver();

		// Open application my store :
		driver.get("http://demo.guru99.com/test/guru99home/");

		// Maximize Browser :
		driver.manage().window().maximize();

		// Delete cookies :
		driver.manage().deleteAllCookies();

		// Switching the Frame By id :
		driver.switchTo().frame("a077aa5e");
		System.out.println("***we are switch to the Iframe***");
		driver.findElement(By.xpath("html/body/a/img")).click();
		System.out.println("***we are done***");

		driver.close();

	}

}
