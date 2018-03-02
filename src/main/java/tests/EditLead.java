package tests;

import org.testng.annotations.Test;

import wrappers.LoginLeaftaps;

public class EditLead extends LoginLeaftaps {
	
	String compName = "DTCC";
	
	@Test(dataProvider="EditLeads Data", dataProviderClass =LearnDataProvider.class)
	
	/*(dependsOnMethods = (tests.CreateLead.createLead") // based on the depend method this test case will run
	
	@Test(enabled=false)// The particular test cases will not run

	@Test(alwaysRun=true) // default the case will run, but this is for run the tc always

@Test(expectedExceptions=Exception.class, alwaysRun = true) //the particular test case will pass for the specific exception or for all the exceptions it will handle and provide result as pass */
	
	public void editLead() throws Exception {
	   // login();
		clickByLink("Leads");		
		clickByLink("Find Leads");
		enterByXpath("(//input[@name='firstName'])[3]", "Vaish");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		clickByLink("Edit");
		enterById("updateLeadForm_companyName", compName);
		clickByClassName("smallSubmit");
		verifyTextContainsByXpath("//*[@id='viewLead_companyName_sp']", compName);
	}

	
}