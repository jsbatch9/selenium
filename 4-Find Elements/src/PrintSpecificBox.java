import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSpecificBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JavaScript/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cnn.com/");
		driver.manage().window().maximize();
		
		//get the box
		WebElement box = driver.findElement(By.cssSelector(".cn.cn-list-hierarchical-xs.cn--idx-2.cn-container_33924866-1FBA-7484-9434-55FB07FA31B2"));
		
		//get the list items
		List<WebElement> links = box.findElements(By.tagName("li"));
		
		System.out.println(links.size());
		
		for(int i =0;i<links.size();i++) {
			links.get(i).click();
			driver.navigate().back();
			box = driver.findElement(By.cssSelector(".cn.cn-list-hierarchical-xs.cn--idx-2.cn-container_33924866-1FBA-7484-9434-55FB07FA31B2"));
			links = box.findElements(By.tagName("li"));
		}
		

		
		
		

	}

}
