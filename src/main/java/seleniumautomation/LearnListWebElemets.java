package seleniumautomation;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnListWebElemets {
	
	public static ChromeDriver chromeDriver = null;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
	
		chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		chromeDriver.get("https://www.facebook.com/");
		List<WebElement> fblinks= chromeDriver.findElementsByTagName("a");
		System.out.println(fblinks.size());
		System.out.println(fblinks.get(3).getText());
		fblinks.get(3).click();
		
		//take screenshot of the web browser page not the active window
		File src = chromeDriver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snaps/img1.jpeg "); //select File(String [arg0]) to give the destination place
		FileUtils.copyFile(src, dest); 
		
	}

}
