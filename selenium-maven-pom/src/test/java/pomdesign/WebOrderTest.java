package pomdesign;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AllOrdersPage;
import pages.ProductsPage;
import pages.WebOrderLoginPage;

public class WebOrderTest {
	
	WebDriver driver;
	WebOrderLoginPage loginPage;
	AllOrdersPage allOrdersPage;
	ProductsPage productPage;
	String userID="Tester";
	
	
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
	
	@Ignore
	@Test
	public void labelsVerification() {
		loginPage = new WebOrderLoginPage(driver);
		allOrdersPage = new AllOrdersPage(driver);
		//Assert.assertEquals(driver.getTitle(), "Web Orders Login","Login Page is not displayed.Application is down");
		loginPage.username.sendKeys(userID);
		loginPage.password.sendKeys("test");
		loginPage.loginButton.click();
		Assert.assertTrue(allOrdersPage.webOrders.isDisplayed(),"Web Orders is not displayed");
		Assert.assertTrue(allOrdersPage.listOfAllOrders.isDisplayed(),"ListofAllOrders is not displayed");
		Assert.assertEquals(allOrdersPage.welcomeMsg.getText().replace(" | Logout", ""),"Welcome, " + userID + "!");
		Assert.assertTrue(allOrdersPage.viewAllOrders.isDisplayed(),"View All Orders is not displayed");
		Assert.assertTrue(allOrdersPage.orderTab.isDisplayed(),"Order Tab is not displayed");
		Assert.assertTrue(allOrdersPage.viewAllProducts.isDisplayed(),"View All Products is not displayed");
		
		allOrdersPage.logout();
	}
	
	
	@Test
	public void ProductTest() {
		
		loginPage = new WebOrderLoginPage(driver);
		allOrdersPage = new AllOrdersPage(driver);
		productPage = new ProductsPage(driver);
		
		//Assert.assertEquals(driver.getTitle(), " Web Orders Login","Login Page is not displayed.Application is down");
		loginPage.username.sendKeys(userID);
		loginPage.password.sendKeys("test");
		loginPage.loginButton.click();
		
		allOrdersPage.viewAllProducts.click();
		
		List<String> expectedProducts = Arrays.asList("MyMoney","FamilyAlbum","ScreenSaver");
		
		List<String> actProducts = new ArrayList<>();
		
		for(WebElement prod:productPage.productNames) {
			actProducts.add(prod.getText());
		}
		
		Assert.assertEquals(actProducts, expectedProducts);
		
		for(WebElement row:productPage.productsRow) {
			
			String[] prodData = row.getText().split(" ");
			
			switch(prodData[0]){
				case "MyMoney":
					Assert.assertEquals(prodData[1], "$100");
					Assert.assertEquals(prodData[2], "8%");
					break;
				case "FamilyAlbum":
					Assert.assertEquals(prodData[1], "$80");
					Assert.assertEquals(prodData[2], "15%");
					break;
				case "ScreenSaver":
					Assert.assertEquals(prodData[1], "$20");
					Assert.assertEquals(prodData[2], "10%");
					break;
			}
			
			
			
			
			
			
		}
		
		
		
				
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
