import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "/Users/JavaScript/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		List<WebElement> allCheckBoxes = driver.findElements(By.name("profession"));
		allCheckBoxes.size();
		allCheckBoxes.get(1).click();
		System.out.println(allCheckBoxes.get(1).isSelected());
		
		
		
		

	}

}
