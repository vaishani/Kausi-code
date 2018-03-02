package seleniumautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC {
	
	public static ChromeDriver chromeDriver= null;
	 public static void main (String args[]) {
		 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			chromeDriver = new ChromeDriver();
			chromeDriver.manage().window().maximize();
			chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			chromeDriver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
			System.out.println(chromeDriver.getTitle());
			System.out.println(chromeDriver.getCurrentUrl());
			WebElement label = chromeDriver.findElementByXPath("//*[@id=\"userRegistrationForm:j_idt152_body\"]/table/tbody/tr[1]/td/table/tbody/tr[9]/td[1]/label");
			System.out.println(label.getText());
			System.out.println(label.isEnabled());
			chromeDriver.findElementById("userRegistrationForm:userName").sendKeys("Kausi123");
			chromeDriver.findElementById("userRegistrationForm:password").sendKeys("123456");
			chromeDriver.findElementById("userRegistrationForm:confpasword").sendKeys("123456");
			WebElement source = chromeDriver.findElementById("userRegistrationForm:securityQ");
			Select dd = new Select (source);
			List<WebElement> opt = dd.getOptions();
			int size = opt.size(); 
			for (WebElement eachOpt:opt)
			{
				System.out.println(eachOpt.getText());
			}
			dd.selectByIndex(size-2);
			chromeDriver.findElementById("userRegistrationForm:securityAnswer").sendKeys("ABCDE");
			WebElement source1 = chromeDriver.findElementById("userRegistrationForm:prelan");
			Select dd1 = new Select (source1);
			List<WebElement> opt1 = dd1.getOptions();
			int size1 = opt1.size(); 
			for (WebElement eachOpt:opt)
			{
				System.out.println(eachOpt.getText());
			}
			dd1.selectByIndex(size1-1);
			WebElement labe2 = chromeDriver.findElementByXPath("//*[@id=\"userRegistrationForm:j_idt152_body\"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/strong");
			System.out.println(labe2.getText());
			System.out.println(label.isDisplayed());
			chromeDriver.findElementById("userRegistrationForm:firstName").sendKeys("Kausalya");
			chromeDriver.findElementById("userRegistrationForm:middleName").sendKeys("S");
			chromeDriver.findElementById("userRegistrationForm:lastName").sendKeys("Sri");
			
			
			
			//chromeDriver.findElementById("userRegistrationForm:firstName").sendKeys("Kausi123");
			//chromeDriver.findElementById("userRegistrationForm:password").sendKeys("123456");
			
			
			
			
			
			
		 
	 }
}
