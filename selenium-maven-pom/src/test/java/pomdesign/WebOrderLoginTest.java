package pomdesign;


import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.WebOrderLoginPage;

public class WebOrderLoginTest {
	
	WebDriver driver;
	

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
	}
	
	@AfterTest
	public void closeUp() {
		driver.quit();
	}
	
	
	@Test
	public void login() {
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}
	
	@Test
	public void loginUsingPOM() {
		WebOrderLoginPage loginPage = new WebOrderLoginPage(driver);
		loginPage.username.sendKeys("Tester");
		loginPage.password.sendKeys("test");
		loginPage.loginButton.click();
		
	}
	
	@Test
	public void invalidLogin() {
		WebOrderLoginPage loginPage = new WebOrderLoginPage(driver);
		loginPage.username.sendKeys("Tester123");
		loginPage.password.sendKeys("test");
		loginPage.loginButton.click();
		
		String errorMsg = loginPage.invalidLoginMsg.getText();
		Assert.assertEquals("Invalid Login or Password.", errorMsg);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
