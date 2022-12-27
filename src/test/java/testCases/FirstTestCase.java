package testCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open Chrome :
		WebDriver driver = new ChromeDriver();

		// Implicit wait :
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open application my store :
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		// Maximize Browser :
		driver.manage().window().maximize();

		// Delete cookies :
		driver.manage().deleteAllCookies();

		// Fill user name :
		driver.findElement(By.id("email")).sendKeys("ziedhannachi0@gmail.com");

		// Thread.sleep(3000);

		// Fill Password :
		driver.findElement(By.id("passwd")).sendKeys("Admin123");

		// Click on Sign in Button :
		// driver.findElement(By.id("SubmitLogin")).click();

		// Click on sign in button with explicit wait :
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement btnSubmitLogin;
		btnSubmitLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Submitlogin")));
		btnSubmitLogin.click();

		// Assertion :
		String contact = driver.findElement(By.id("contact-link")).getText();
		Assert.assertEquals("Contact us", contact);

		System.out.println("Login successfully");

		// Close Browser :
		driver.quit();
		// driver.close();

	}

}
