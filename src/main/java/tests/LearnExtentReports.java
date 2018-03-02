package tests;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnExtentReports {
	@Test
	public void report() {
		//Create HTML
		ExtentReports reports = new ExtentReports ("./Reports/result.html", false); //Before Suite
	    // Load config xml
		reports.loadConfig(new File("./config.xml")); //Before Suite
		//Create Test
		ExtentTest test = reports.startTest("TC001", "Generate a sample report"); //Before Test
		//Assign Author
		test.assignAuthor("Kausalya"); //Before Class
		//Assign Category
		test.assignCategory("Smoke"); //Before class
		//Create Log	
		test.log(LogStatus.PASS, "sample test"+test.addScreenCapture(".././Snaps/img1.png")); //@ Test
		//test.log(LogStatus.FAIL, "sample test"+test.addScreenCapture(".././Snaps/img1.png"));
		//End test 
		reports.endTest(test); // After Test
		//Save Report
		reports.flush(); // After Suite
	}

}
