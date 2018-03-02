package pages;

import wrappers.SeMethods;

public class MyHomePage extends SeMethods{
	public MyHomePage clickLeads()
	{
		clickByLink("Leads");
		return this;
	}

	
}
