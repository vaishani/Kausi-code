package pages;

import wrappers.SeMethods;

public class HomePage extends SeMethods{
	public MyHomePage clickCRMSFA()
	{
		clickByLink("CRM/SFA");
		return new MyHomePage();
	}

}