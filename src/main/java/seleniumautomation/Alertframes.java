package seleniumautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class Alertframes {
	

	public static void main (String args[])
	{
   
    System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	ChromeDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.switchTo().frame("iframeResult");
	driver.findElementByXPath("//button[text()='Try it']").click();
	driver.switchTo().alert().sendKeys("Alert and Frames");
	driver.switchTo().alert().accept();
	System.out.println(driver.findElementById("demo").getText());
	driver.switchTo().defaultContent();
	System.out.println(driver.findElementById("framesize").getText());

}
}
