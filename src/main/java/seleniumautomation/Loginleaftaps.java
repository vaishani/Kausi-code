package seleniumautomation;

import java.util.List; // always select util.list
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Loginleaftaps {
	
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		

		
		//To lauch driver and url
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit wait - It affects only find elements, it is responsible only for find elements
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		
		//title
		System.out.println(driver.getTitle());
		
		//to get the Current url
		System.out.println(driver.getCurrentUrl());
		
		//xpath
		
        //String username = driver.findElementByXPath("//*[@id=\"login\"]/p[1]/label").getText();
        //System.out.println(username);
		
		WebElement label = driver.findElementByXPath("//*[@id=\"login\"]/p[1]/label");
		System.out.println(label.getText());
		System.out.println(label.isEnabled());
		
		// to find default values
		
		/*System.out.println(label.getAttribute("value")); // for textbox
		System.out.println(label.getAttribute("href")); // for url
		System.out.println(label.getAttribute("src")); // for image
*/		
		
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		createTestLead();
		findtestlead();
		edittestlead();
		//driver.close();
	}

	private static void edittestlead() {
		// to click the first link
				driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
				System.out.println(driver.getTitle());
				driver.findElementByLinkText("Edit").click();
				driver.findElementById("updateLeadForm_companyName").clear();
				driver.findElementById("updateLeadForm_companyName").sendKeys("TAB");;
				driver.findElementByName("submitButton").click();	
				System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
				
		
	}

	private static void findtestlead() throws InterruptedException {
				
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Kausalya");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);		
	}

	private static void createTestLead() throws InterruptedException {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("DTCC");
		driver.findElementById("createLeadForm_firstName").sendKeys("Kausalya");
		driver.findElementById("createLeadForm_lastName").sendKeys("S");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Test");
		driver.findElementByName("submitButton").click();	
		
		//To select values from the drop down
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd = new Select (source); // create new select class for drop down
		
		List<WebElement> opt = dd.getOptions(); // to get the options using list 
		
		int size = opt.size(); // to get the no of available options in the drop down
		
		dd.selectByIndex(size-2); // to select the last but not one value, use index for not hard coded value
		
		dd.selectByVisibleText("Partnership"); // for sending the available value from dd
		dd. selectByValue("IND_HARDWARE"); // To give attribute value in option tag which is in blue
		
		// To print the available options int the list
		for (WebElement eachOpt:opt)
		{
			System.out.println(eachOpt.getText());
		}
		
		WebElement Ind = driver.findElementById("createLeadForm_industryEnumId");
		Select dd1 = new Select (Ind);
		dd1.selectByVisibleText("Computer Software");
		WebElement Own = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd2 = new Select (Own);
		dd2.selectByVisibleText("Partnership");
		WebElement MarCom = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd3 = new Select (MarCom);
		dd3.selectByVisibleText("Car and Driver");
		WebElement Curr = driver.findElementById("createLeadForm_currencyUomId");
		Select dd4 = new Select (Curr);
		dd4.selectByVisibleText("ADP - Andoran peseta");
		WebElement Count = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd6 = new Select (Count);
		dd6.selectByVisibleText("USA");
		Thread.sleep(3000); // java code will go to sleep mode for 3 sec
		WebElement Pro = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dd5 = new Select (Pro);
		dd5.selectByVisibleText("Hawaii");
		// To get the location
		Point loc = driver.findElementById("createLeadForm_dataSourceId").getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		}

}
