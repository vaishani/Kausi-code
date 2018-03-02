package tests;

import org.testng.annotations.Test;

import wrappers.LoginLeaftaps;

public class Findleads extends LoginLeaftaps {
	
	String compName = "DTCC";
	
@Test(dataProvider="FindLeads Data", dataProviderClass =LearnDataProvider.class)
	public void editLead() throws Exception {
	    //login();
		clickByLink("Leads");		
		clickByLink("Find Leads");
		enterByXpath("(//input[@name='firstName'])[3]", "Vaish");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");		
	}

	
}