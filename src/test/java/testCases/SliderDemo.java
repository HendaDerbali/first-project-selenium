package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) {

		// Open Chrome By bonigarcia :

		ChromeOptions chromeOptions = new ChromeOptions(); // bonigarcia
		WebDriverManager.chromedriver().setup(); // bonigarcia
		WebDriver driver = new ChromeDriver(chromeOptions); // bonigarcia

		// Open application my store :
		driver.get("http://demoqa.com/slider/");

		// Maximize Browser :
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		actions.moveToElement(slider, 50, 0).perform();
		slider.click();

		driver.quit();

	}

}
