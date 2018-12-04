package testcases;
import org.testng.annotations.Test;

public class AppPriority {
	
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
