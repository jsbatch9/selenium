import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JavaScript/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Terms']")).click();
		
		Set<String> winIds=driver.getWindowHandles();
		System.out.println(winIds.size());
		
		Iterator<String> it = winIds.iterator();
		
		String mainWindow = it.next();
		String firstWindow = it.next();
		
		driver.switchTo().window(firstWindow);
		
		driver.switchTo().window(mainWindow);
		
		
		
		
		
		
		
		
		

	}

}
