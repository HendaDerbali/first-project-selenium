package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUoloadDemo2 {

	public WebDriver driver; // bonigarcia
	public WebDriverWait wait;
	private static String filePath = "C:\\Users\\DERBALI\\Desktop\\Selenium WD \\test1.txt";

	@BeforeMethod
	public void setup() {
		ChromeOptions chromeOptions = new ChromeOptions();  // bonigarcia
		WebDriverManager.chromedriver().setup();   //bonigarcia
		driver = new ChromeDriver(chromeOptions);  //bonigarcia
		driver.navigate().to("https://blueimp.github.io/jQuery-File-Upload/"); // open application - new method
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // Implicit Wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Declaration of element Explicit Wait
		driver.manage().window().maximize(); // Maximize Browser
	}

	
	@Test
	public void robotTest() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success.fileinput-button"))); // Explicit
																													// wait
		driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click(); // explicit wait
		uploadFileWithRobot(filePath);
		Thread.sleep(3000);

	}
	
	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

	// File Upload by robot class : ligne 47
	public void uploadFileWithRobot(String imagePath) {
		StringSelection stringSelection = new StringSelection(imagePath);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		Robot robot = null;
		try {
			robot = new Robot();

		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(150);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
