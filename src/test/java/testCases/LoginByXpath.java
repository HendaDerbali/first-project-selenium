package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginByXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open Chrome :
		WebDriver driver = new ChromeDriver();

		// Open application my store :
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		// Maximize Browser :
		driver.manage().window().maximize();

		// Delete cookies :
		driver.manage().deleteAllCookies();

		// Fill user name :
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ziedhannachi0@gmail.com");

		// Fill Password :
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Admin123");

		// Click on Sign in Button :
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();

		// Assertion :
		String contact = driver.findElement(By.id("contact-link")).getText();
		Assert.assertEquals("Contact us", contact);

		System.out.println("Login successfully");

		// Close Browser :
		driver.quit();

	}

}
