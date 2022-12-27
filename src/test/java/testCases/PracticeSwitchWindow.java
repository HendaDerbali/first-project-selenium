package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSwitchWindow {

	public static void main(String[] args) {

		// Open Chrome By bonigarcia :

		ChromeOptions chromeOptions = new ChromeOptions(); // bonigarcia
		WebDriverManager.chromedriver().setup(); // bonigarcia
		WebDriver driver = new ChromeDriver(chromeOptions); // bonigarcia

		// Open application my store :
		String url = "https://demoqa.com/browser-windows";
		driver.get(url);

		// Maximize Browser :
		driver.manage().window().maximize();

		// Store and Print the name of the first Window :
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		// Click on the button new window message :
		driver.findElement(By.id("messageWindowButton")).click();

		// Store and Print the name of all window open:
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		// Pass a window handle to another window :
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);

		}
		driver.quit();

	}

}
