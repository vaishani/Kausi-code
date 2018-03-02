package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LoginLeaftaps extends SeMethods{
	@Parameters({"browser", "url","username","password"})
	@BeforeMethod
	public void login(String browser, String url, String username, String password)
	{
		invokeApp(browser, url);
		enterById("username", username);
		enterById("password", password);
	
		/*@Test
		public void login() {
			
			//Open the browser
			invokeApp("chrome", "http://leaftaps.com/opentaps");
			
			//Find the username and enter the value
			enterById("username", "DemoSalesManager");

			//Find the password and enter the value
			enterById("password", "crmsfa");
	*/
	
	
	
		//Click Login button
		clickByClassName("decorativeSubmit");
		 
		clickByLink("CRM/SFA");
	}
	@AfterMethod
	public void cloaseApp()
	{
	closeAllBrowsers();
}
	
		
}
