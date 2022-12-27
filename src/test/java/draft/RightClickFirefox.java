package draft;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "src/test/resource/drivers/geckodriver.exe");

		// Open Firefox
		WebDriver driver = new FirefoxDriver();

		// Open application my store :
		driver.get("http://demoqa.com/buttons");

		// Maximize Browser :
		driver.manage().window().maximize();

		// Delete cookies :
		driver.manage().deleteAllCookies();

		// Doing Right Click : using Class Actions :
		Actions actions = new Actions(driver);
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(btnRightClick).perform();

		// Assertions :
		String actualMessage = driver.findElement(By.id("rightClickMessage")).getText();
		String expectedMessage = "You have done a right click";
		Assert.assertEquals(expectedMessage, actualMessage);

		driver.quit();

	}

}
