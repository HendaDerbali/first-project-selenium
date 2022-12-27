package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyColor {

	public static void main(String[] args) {

		// Open Chrome By bonigarcia :

		ChromeOptions chromeOptions = new ChromeOptions(); // bonigarcia
		WebDriverManager.chromedriver().setup(); // bonigarcia
		WebDriver driver = new ChromeDriver(chromeOptions); // bonigarcia

		// Open application my store :
		String url = "https://www.facebook.com/";
		driver.get(url);

		driver.manage().window().maximize();

		// Verify Color :
		String color = driver.findElement(By.linkText("Mot de passe oublié ?")).getCssValue("color");
		String[] hexValue = color.replace("rgba(", "").split(",");

		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();

		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();

		int hexValue3 = Integer.parseInt(hexValue[2]);

		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);

		Assert.assertEquals("#1877f2", actualColor);
		System.out.println("The color is:" + actualColor);

		driver.quit();

	}

}
