import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/JavaScript/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.cssSelector(".floatL.bold")).getText();
		System.out.println(text);
		
		driver.findElement(By.id("login1")).sendKeys("Mike");
		String text2 = driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(text2);
		
		String txt = driver.findElement(By.name("proceed")).getAttribute("value");
		System.out.println(txt);
		
		String txt2 = driver.findElement(By.cssSelector(".floatL.f12.margTop5>:nth-child(2)")).getText();
		System.out.println(txt2);
		
		
		

	}

}
