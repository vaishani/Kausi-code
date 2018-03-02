package pages;

import wrappers.SeMethods;

public class LoginPage extends SeMethods {

	public LoginPage enteruserName(String userName) {
		enterById("username", userName);
		return this;
		
	}
	
	public LoginPage enterpassword(String passWord) {
		enterById("password", passWord);
		return this;
		
	}
	public HomePage clickLogin() {
		clickByClassName("decorativeSubmit");
		return new HomePage();
		
	}
	public LoginPage clickLoginFailure() {
		clickByClassName("decorativeSubmit");
		return this;
	}
	
}
