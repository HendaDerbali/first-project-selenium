package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open Chrome :
		WebDriver driver = new ChromeDriver();

		// Open application my store :
		driver.get("https://demoqa.com/select-menu");

		// Maximize Browser :
		driver.manage().window().maximize();

		// Create Object Of the Select Class :
		WebElement dropDownList = driver.findElement(By.id("oldSelectMenu"));
		Select se = new Select(dropDownList);

		// se.selectByIndex(5);
		se.selectByValue("6");
		// se.selectByVisibleText("Green");

		driver.quit();

	}

}
