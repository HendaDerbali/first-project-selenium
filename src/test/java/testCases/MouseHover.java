package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open Chrome :
		WebDriver driver = new ChromeDriver();

		// Open application my store :
		driver.get("https://demoqa.com/menu/");

		// Maximize Browser :
		driver.manage().window().maximize();

		// Delete cookies :
		driver.manage().deleteAllCookies();
		
		Actions actions = new Actions(driver);
		WebElement moseHover = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		actions.moveToElement(moseHover).perform();
		
		driver.quit();
		

	}

}
