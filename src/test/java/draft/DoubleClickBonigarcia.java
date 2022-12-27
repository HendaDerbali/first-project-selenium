package draft;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickBonigarcia {

	public static void main(String[] args) {

		// Open Chrome By bonigarcia :
		ChromeOptions chromeOptions = new ChromeOptions(); // bonigarcia
		WebDriverManager.chromedriver().setup(); // bonigarcia
		WebDriver driver = new ChromeDriver(chromeOptions); // bonigarcia

		// Open application my store :
		driver.get("http://demoqa.com/buttons");

		// Maximize Browser :
		driver.manage().window().maximize();

		// Instantiate Actions Class
		Actions actions = new Actions(driver);

		// Retrieve Web Element to perform double Click
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));

		// Double Click on the button :
		actions.doubleClick(btnDoubleClick).build().perform();

		String actualMessage = driver.findElement(By.id("doubleClickMessage")).getText();
		String expectedMessage = "You have done a double click";
		Assert.assertEquals(expectedMessage, actualMessage);

		driver.quit();
	}

}
