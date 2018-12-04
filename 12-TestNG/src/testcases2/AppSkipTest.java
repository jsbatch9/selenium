package testcases2;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppSkipTest {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("---Before Suit----");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("---After Suit---");
	}
	
	@Test(priority=1,enabled=false)
	public void LoginTest() {
		//selenium code
		System.out.println("Login");
	}
	
	@Test(priority=2)
	public void PasswordChange() {
		System.out.println("Changing Paasword");
		throw new SkipException("reason");
	}
	
	@Test(priority=3)
	public void LogoutTest() {
		System.out.println("Logout");
	}

}
