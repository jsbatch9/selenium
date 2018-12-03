import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AppAssertions {
	
	
	SoftAssert sa = new SoftAssert();
	
	@Test
	public void RegisterTest() {
		
//		String expectedTitle="yahoo";
//		String actualTitle="yahoo1";
//		
//		System.out.println("A");
//		
//		Assert.assertEquals(actualTitle, expectedTitle);
//		
//		System.out.println("B");
//		
//		
//		//Assert.assertTrue(20>11,"Error");
		
		
		//////////////////////////////////
		
		String expectedTitle="yahoo";
		String actualTitle="yahoo1";
		
		System.out.println("A");
		
		sa.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("B");
		
		sa.assertEquals("a", "c");
		
		sa.assertAll();
		
		
		
		
		
		
		
		
		
	}

}
