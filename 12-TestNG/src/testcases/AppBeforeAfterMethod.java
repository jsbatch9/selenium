package testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppBeforeAfterMethod {
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("---Before Method---");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("---After Method---");
	}
	
	@Test(priority=1)
	public void LoginTest() {
		//selenium code
		System.out.println("Login");
	}
	
	@Test(priority=2)
	public void PasswordChange() {
		System.out.println("Changing Paasword");
	}
	
	@Test(priority=3)
	public void LogoutTest() {
		System.out.println("Logout");
	}

}
