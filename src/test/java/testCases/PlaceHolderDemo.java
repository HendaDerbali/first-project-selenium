package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaceHolderDemo {

	public static void main(String[] args) {

		// Open Chrome By bonigarcia :

		ChromeOptions chromeOptions = new ChromeOptions(); // bonigarcia
		WebDriverManager.chromedriver().setup(); // bonigarcia
		WebDriver driver = new ChromeDriver(chromeOptions); // bonigarcia

		// Open application my store :
		driver.get("http://demoqa.com/tool-tips/");

		// Maximize Browser :
		driver.manage().window().maximize();

		WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));
		String textPlaceHolder = placeHolder.getAttribute("placeHolder");

		// to do add assert
		System.out.println("The placeHolder of the field is : " + textPlaceHolder);

		// To Do : ADD Assert
		driver.quit();

	}
}
