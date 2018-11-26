import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DynamicBrowser {

	public static void main(String[] args) {
//		
//		String browser = "Chrome";
//		
//		if(browser.equals("Chrome")) {
//			System.setProperty("webdriver.chrome.driver", "/Users/JavaScript/Selenium/chromedriver");
//			ChromeDriver driver = new ChromeDriver();
//			driver.get("https://www.amazon.com/");
//			//selenium
//		}else if(browser.equals("Firefox")) {
//			System.setProperty("webdriver.gecko.driver", "/Users/JavaScript/Selenium/geckodriver");
//			FirefoxDriver driver = new FirefoxDriver();
//			driver.get("https://www.amazon.com/");
//			//selenium
//		}
		
		
		
		String browser = "Firefox";
		WebDriver driver=null;
		
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/JavaScript/Selenium/chromedriver");
			driver = new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/JavaScript/Selenium/geckodriver");
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.amazon.com/");
		//selenium



		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
