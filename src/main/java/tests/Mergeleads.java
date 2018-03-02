package tests;

import org.testng.annotations.Test;

import wrappers.LoginLeaftaps;

public class Mergeleads extends LoginLeaftaps {
	@Test
	public void merge() throws InterruptedException{
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		enterByXpath("//input[@name='id']", "10198");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(2000);
		clickByXpathNoSnap("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a)[1]");
		switchToParentWindow();
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		enterByXpath("//input[@name='id']", "10211");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(2000);
		clickByXpathNoSnap("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a)[1]");
		switchToParentWindow();
		clickByXpathNoSnap("//a[@class='buttonDangerous']");
		getAlertText();
		acceptAlert();
		clickByLink("Find Leads");
		enterByXpath("//input[@type='text' and @name='id']", "10401");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		if(getTextByXpath("//div[text()='No records to display']").equals("No records to display")){
			System.out.println("Test case passed");
		}

	}
}