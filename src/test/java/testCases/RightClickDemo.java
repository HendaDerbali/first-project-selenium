package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open Chrome :
		WebDriver driver = new ChromeDriver();

		// Open application my store :
		driver.get("http://demoqa.com/buttons");

		// Maximize Browser :
		driver.manage().window().maximize();

		// Instantiate Actions Class
		Actions actions = new Actions(driver);

		// Retrieve Web Element to perform double Click
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));

		actions.contextClick(btnRightClick).perform();

		String actualMessage = driver.findElement(By.id("rightClickMessage")).getText();
		String expectedMessage = "You have done a right click";
		Assert.assertEquals(expectedMessage, actualMessage);

		driver.quit();

	}

}
