package tests;



import org.testng.annotations.Test;

import wrappers.LoginLeaftaps;

public class CreateLeads extends LoginLeaftaps {
	/*@Test //(invocationCount=2) // invocation count = to run the same test case n number of times with same data
	public void createLead() {
	//login();
	clickByLink("Leads");
	clickByLink("Create Lead");
	enterById("createLeadForm_companyName", "DTCC");
	enterById("createLeadForm_firstName", "Vaish");
	enterById("createLeadForm_lastName", "A");
	enterById("createLeadForm_generalProfTitle", "Automate");
	clickByName("submitButton");*/
	
	@Test(dataProvider="CreateLeads Data", dataProviderClass =LearnDataProvider.class)
	public void createLead(String cName, String fName, String lName, String a) {
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", cName);
		enterById("createLeadForm_firstName", fName);
		enterById("createLeadForm_lastName", lName);
		clickByName("submitButton");
}
}
