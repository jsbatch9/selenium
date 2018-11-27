import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JavaScript/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cnn.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText() + "|" + links.get(i).isDisplayed());
		}
		
//		System.out.println(links.size());
		
//		WebElement link = links.get(9);
//		System.out.println(link.getText());
//		link.click();
		
		
		
		

	}

}
