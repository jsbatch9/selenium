import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JavaScript/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.priceline.com/");
		driver.manage().window().maximize();
		
//		Select s = new Select(driver.findElement(By.id("rooms")));
//		
//		s.selectByIndex(2);
//		s.selectByValue("7");
//		
//		//Print Everything From List
//		List<WebElement> options = s.getOptions();
//		System.out.println(options.size());
		
		//Select Multiple
		driver.get("http://toolsqa.com/automation-practice-form/");
		Select s = new Select(driver.findElement(By.id("selenium_commands")));
		s.selectByIndex(0);
		s.selectByIndex(3);
		
		List<WebElement> allSelected = s.getAllSelectedOptions();
		System.out.println(allSelected.size());
		for(WebElement e : allSelected) {
			System.out.println(e.getText());
		}
		
		
		
		
		
		
		
		
		

	}

}
