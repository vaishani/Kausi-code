package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class FrameworkSample extends LoginPage {
	@Test
	public void samplePOMmethod()
	{
	new LoginPage().enteruserName("DemoSalesManager").enterpassword("crmsfa").clickLogin();
			
	}
 public void createLoginFailure()
 {
	 new LoginPage().enteruserName("DemoSalesManager").clickLoginFailure();
 }
 
}
