package testcases;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppBeforeAfterTest {
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Executing Test Case");
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
