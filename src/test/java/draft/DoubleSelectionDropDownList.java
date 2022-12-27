package draft;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class DoubleSelectionDropDownList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		// Open Chrome :
		WebDriver driver = new ChromeDriver();

		// Open Application :
		driver.get("https://demoqa.com/select-menu");

		// Maximize Browser :
		driver.manage().window().maximize();

		// Delete cookies :
		driver.manage().deleteAllCookies();
		
		//  Selection of All list :
		//WebElement dropDownList = driver.findElement(By.id("cars"));  
		//Select se = new Select(dropDownList);
		// Select select = new Select(driver.findElement(By.id("cars")));
		// se : select 
		
		// Get the list of all options By using List : 
	//	List<WebElement> options = se.getOptions();
		
		
		
		
		
		
		
		

	}

}
