package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "src/test/resource/drivers/geckodriver.exe");
		// Open Firefox :
		WebDriver driver = new FirefoxDriver();

		// Open application my store :
		driver.get("https://demoqa.com/alerts");

		// Maximize Browser :
		driver.manage().window().maximize();

		WebElement btnClickMe = driver.findElement(By.id("alertButton"));
		btnClickMe.click();

		// Accept Alert :
		driver.switchTo().alert().accept();

		String title = driver.getTitle();
		System.out.println("The Tile of The application is : " + title);

		driver.quit();

	}

}
