package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open Chrome :
		WebDriver driver = new ChromeDriver();

		// Open application my store :
		driver.get("http://demoqa.com/droppable/");

		// Maximize Browser :
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		actions.dragAndDrop(source, target).build().perform();

		// Verify text changed into dropped! :
		String textTarget = target.getText();
		if (textTarget.equals("Dropped!")) {
			System.out.println("pass: source is dropped to target as expected");
		} else {
			System.out.println("fail: source is not dropped to target as expected");
		}
		driver.quit();
	}

}
