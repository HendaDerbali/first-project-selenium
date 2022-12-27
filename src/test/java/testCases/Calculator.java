package testCases;

import org.openqa.selenium.By;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.regex.Pattern;

public class Calculator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open Chrome :
		WebDriver driver = new ChromeDriver();

		// Open application my store :
		driver.get("https://juliemr.github.io/protractor-demo/");

		// Maximize Browser :
		driver.manage().window().maximize();

		// Delete cookies :
		driver.manage().deleteAllCookies();

		driver.findElement(By.xpath("//input[@ng-model = 'first']")).click();

		driver.findElement(By.xpath("//input[@ng-model = 'first']")).sendKeys("1");

		driver.findElement(By.xpath("//input[@ng-model = 'second']")).click();

		driver.findElement(By.xpath("//input[@ng-model = 'second']")).sendKeys("2");

		driver.findElement(By.id("gobutton")).click();

		WebElement result = driver.findElement(By.tagName("h2"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Pattern pattern = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));

		System.out.println("The result is : " + result.getText());

		driver.quit();

	}

}
