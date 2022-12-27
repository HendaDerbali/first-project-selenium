package draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCaseFirefoxLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "src/test/resource/drivers/geckodriver.exe");
		
		// Open Firefox
		WebDriver driver = new FirefoxDriver();

		// Open application my store :
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		// Maximize Browser :
		driver.manage().window().maximize();

		// Delete cookies :
		driver.manage().deleteAllCookies();

		// Fill user name :
		driver.findElement(By.id("email")).sendKeys("ziedhannachi0@gmail.com");

		// Fill Password :
		driver.findElement(By.id("passwd")).sendKeys("Admin123");
		
		driver.quit();

	}

}
