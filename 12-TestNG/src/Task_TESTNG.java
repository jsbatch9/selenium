import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task_TESTNG {
	
	@BeforeMethod
	public void login() {
		System.out.println("Login");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
	
	@Test(priority=1)
	public void register() {
		System.out.println("Register successfully complated");
	}
	
	@Test(priority=2,dependsOnMethods= {"register"})
	public void search() {
		System.out.println("Search successfully complated");
		throw new SkipException("error");
	}
	
	@Test(priority=3,dependsOnMethods= {"search"})
	public void buy() {
		System.out.println("Buy successfully complated");
	}
	
	@Test(priority=4,dependsOnMethods= {"buy"})
	public void pay() {
		System.out.println("Pay successfully complated");
	}

}
