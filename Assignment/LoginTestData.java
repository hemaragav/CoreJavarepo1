package Week3.Assignment;

public class LoginTestData extends TestData{
	
	public void enterUsername()
	{
		System.out.println("enterUsername");
	}
	public void enterPassword()
	{
		System.out.println("enterPassword");
	}
	
	public static void main(String[] args) {
		
		LoginTestData data = new LoginTestData();
		data.enterCredentials();
		data.enterPassword();
		data.enterUsername();
		data.navigateToHomePage();
		
	}

}
