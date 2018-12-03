import org.testng.SkipException;
import org.testng.annotations.Test;

public class AppDependsOnMethods {
	
	@Test(priority=4)
	public void LogoutTest2() {
		System.out.println("Logout2");
	}
	
	@Test(priority=1)
	public void LoginTest() {
		//selenium code
		System.out.println("Login");
		throw new SkipException("error");
	
	}
	
	@Test(priority=2,dependsOnMethods= {"LoginTest"})
	public void PasswordChange() {
		System.out.println("Changing Paasword");
	}
	
	@Test(priority=3,dependsOnMethods= {"PasswordChange"})
	public void LogoutTest() {
		System.out.println("Logout");
	}
	


}
