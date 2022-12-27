package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardEvents {

	public static void main(String[] args) {

		// Open Chrome By bonigarcia :

		ChromeOptions chromeOptions = new ChromeOptions(); // bonigarcia
		WebDriverManager.chromedriver().setup(); // bonigarcia
		WebDriver driver = new ChromeDriver(chromeOptions); // bonigarcia

		// Open application my store :
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		
		// Find Web Element :
		WebElement userName = driver.findElement(By.id("userName"));
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		WebElement currentAdress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAdress = driver.findElement(By.id("permanentAddress"));
		
		// Instantiate Actions Class :
		Actions actions = new Actions(driver);
		actions.sendKeys(userName, "Henda").perform();
		actions.sendKeys(userEmail, "Henda@gmail.com").perform();
		actions.sendKeys(currentAdress, "Mourouj").perform();
		
		// Copy current address to permanent Address :
		actions.keyDown(currentAdress, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(currentAdress, Keys.CONTROL).sendKeys("c").keyUp(permanentAdress, Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		// JavascriptExecuto click button submit :
		WebElement btnSbmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0],click(;", btnSbmit);
		
		
		
		
		
		
		
	}

}
