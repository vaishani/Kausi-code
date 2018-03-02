package tests;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	@DataProvider(name="CreateLeads Data")
	public static Object[][] createLeadData()	{
		String data[][]=new String[2][3];
		data[0][0]="Testleaf";
		data[0][1] ="ABC";
		data[0][2]="D";
				
		data[1][0] ="Wipro";
		data[1][1] = "MNO";
		data[1][2] = "P";
		return data;
	}
	@DataProvider(name="FindLeads Data")
	public static Object[][] findLeadData()	{
		String data[][]=new String[2][2];
		data[0][0]="ABC";
		data[0][1] ="TestLeaf";
	
				
		data[1][0] ="MNO";
		data[1][1] = "Wipro";
		return data;
	}
	@DataProvider(name="EditLeads Data")
	public static Object[][] editLeadData()	{
		String data[][]=new String[2][3];
		data[0][0]="Testleaf";
		data[0][1] ="ABC";
		data[0][2]="D";
				
		data[1][0] ="Wipro";
		data[1][1] = "MNO";
		data[1][2] = "P";
		return data;
}
}
