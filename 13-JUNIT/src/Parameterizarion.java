import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


//Step-1
@RunWith(Parameterized.class)
public class Parameterizarion {
	
	//Step-2
	public String bankName;
	public int accountNumber;
	
	//Step-3
	public Parameterizarion(String bankName, int accountNumber) {
		this.bankName = bankName;
		this.accountNumber = accountNumber;
	}
	
	//Step-4
	@Parameters
	public static Object[][] getData(){
		
		Object data[][] = new Object[2][2];
		data[0][0]="Citibank";
		data[0][1]=2222;
		
		data[1][0]="Suntrust";
		data[1][1]=5555;
		
		return data;
		
		
	}
	
	@Test
	public void checkBalance() {
		System.out.println("Executing the test with " + bankName + " ---- " + accountNumber);
	}



}
