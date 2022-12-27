package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open Chrome :
		WebDriver driver = new ChromeDriver();

		// Open application my store :
		driver.get("http://demo.guru99.com/test/upload/");

		// Maximize Browser :
		driver.manage().window().maximize();

		// Delete cookies :
		driver.manage().deleteAllCookies();

		WebElement btnUpload = driver.findElement(By.id("uploadfile_0"));

		btnUpload.sendKeys("C:\\Users\\DERBALI\\Desktop\\Selenium WD \\test1.txt");

	}

}
