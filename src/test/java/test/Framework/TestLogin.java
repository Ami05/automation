package test.Framework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestLogin extends Common {

	
	@Parameters({"emailId", "password"})
	@Test
	public void LoginTest(String emailId, String password) {
		
		help.launchUrl("https://google.com");
		help.enterValue(prop.getLocator("searchBar"),"apple");
		help.click(prop.getLocator("apple"));
		System.out.println("Successfully Logged In");
		System.out.println(emailId);
		System.out.println(password);
		 
		help.endTestCase("pass");
		
	}
}
