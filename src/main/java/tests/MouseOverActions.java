package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MouseOverActions {
@Test
	public void main() throws InterruptedException, MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://172.24.200.182:4444/wd/hub"), dc);
		
	driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> list = driver.findElementsByXPath("//button[text()='✕']");
		if (list.size()>0) {
			list.get(0).click();
		}
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement apple = driver.findElementByXPath("//span[text()='Apple']");
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).perform();
		Thread.sleep(2000);
		builder.click(apple).perform();
		
		
	}

}
