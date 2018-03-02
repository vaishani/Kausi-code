package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements Wrappers{

	RemoteWebDriver driver;
	int i = 1;

	public void invokeApp(String browser, String url) {
		switch (browser) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", 
					"./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", 
					"./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		default:
			System.setProperty("webdriver.edge.driver", 
					"./drivers/MicrosoftWebDriver.exe");
			driver =   new EdgeDriver();
			break;		
		}

		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Load the URL
		driver.get(url);

		//Maximize the browser
		driver.manage().window().maximize();
		
		takeSnap();


	}

	
	public void enterById(String idValue, String data) {
		driver.findElementById(idValue).clear();
		driver.findElementById(idValue).sendKeys(data);
		System.out.println("The text field with id "+idValue+" entered with value :"+data);
		takeSnap();

	}

	
	public void enterByName(String nameValue, String data) {
	driver.findElementByName(nameValue).sendKeys(data);
	System.out.println("The text field with id "+nameValue+" entered with value :"+data);
	takeSnap();
	}

	
	public void enterByXpath(String xpathValue, String data) {
		driver.findElementByXPath(xpathValue).sendKeys(data);
		System.out.println("The text field with id "+xpathValue+" entered with value :"+data);
		takeSnap();

	}

	
	public boolean verifyTitle(String title) {
		driver.getTitle();
		System.out.println("The title is"+title);
	return false;
	}

	
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub

	}

	
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	
	public void clickById(String id) {
		// TODO Auto-generated method stub

	}

	
	public void clickByClassName(String classVal) {
		driver.findElementByClassName(classVal).click();
		System.out.println("The button with class name "+classVal+" is clicked");
		takeSnap();

	}

	
	public void clickByName(String name) {
		driver.findElementByName(name).click();
		System.out.println("The button with  name "+name+" is clicked");
		takeSnap();

	}

	
	public void clickByLink(String name) {
	driver.findElementByLinkText(name).click();
	System.out.println("The link with name "+name+" is clicked");
	takeSnap();
	}

	
	public void clickByLinkNoSnap(String name) {
		driver.findElementByLinkText(name).click();
		System.out.println("The link with name "+name+" is clicked");
	}

	
	public void clickByXpath(String xpathVal) {
		driver.findElementByXPath(xpathVal).click();

	}

	
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub

	}

	
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub

	}

	
	public void selectIndexById(String id, int value) {
		WebElement element = driver.findElementById(id);
		Select sel = new Select(element);
		List<WebElement> opt = sel.getOptions();
		int size = opt.size();
		for (WebElement eachOpt:opt)
		{
			System.out.println(eachOpt.getText());
		}
		sel.selectByIndex(value);
	}

	
	public void switchToParentWindow() {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> list = new ArrayList<String>();
			list.addAll(allWindows);
			driver.switchTo().window(list.get(0));
			System.out.println("Switched to last window");
		} catch (NoSuchWindowException e) {
			throw new RuntimeException("Exception occured");
		}catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}	
	
	}

	
	public void switchToLastWindow() {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> list = new ArrayList<String>();
			list.addAll(allWindows);
			driver.switchTo().window(list.get(list.size()-1));
			System.out.println("Switched to last window");
		} catch (NoSuchWindowException e) {
			throw new RuntimeException("Exception occured");
		}catch (WebDriverException e) {
			throw new RuntimeException("Exception occured");
		} catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}

	}

	
	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void takeSnap() {
		//Screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snaps/img"+i+".png");
		i++;
		try {
			FileUtils.copyFile(src, dest);
		}
		catch (IOException e) {
			throw new RuntimeException();
		}
		catch (Exception e) {

		} finally {

		}

	}

	
	public void closeBrowser() {
		// TODO Auto-generated method stub

	}

	
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

}
