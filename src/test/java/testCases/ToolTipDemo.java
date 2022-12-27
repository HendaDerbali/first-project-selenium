package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipDemo {

	public static void main(String[] args) {

		// Open Chrome By bonigarcia :

		ChromeOptions chromeOptions = new ChromeOptions(); // bonigarcia
		WebDriverManager.chromedriver().setup(); // bonigarcia
		WebDriver driver = new ChromeDriver(chromeOptions); // bonigarcia

		// Open application my store :
		driver.get("http://demoqa.com/tool-tips/");

		// Maximize Browser :
		driver.manage().window().maximize();

		WebElement text = driver.findElement(By.id("toolTipButton"));
		String toolTipText = text.getText();
		if (toolTipText.equalsIgnoreCase("Hover me to see")) {
			System.out.println("Pass : toolTip matching expected value");
		} else {
			System.out.println("Fail : toolTip not matching expected value");

		}
		driver.quit();

	}

}
