package seleniumautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenshotsLearn {
	public ChromeDriver chromeDriver;

	public void takeSnap()  {
		File src = chromeDriver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snaps/img1.jpeg "); //select File(String [arg0]) to give the destination place
		
		//try catch to handle throws io exception
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
			//e.printStackTrace();
		}
		catch (Exception e) {
			throw new RuntimeException();
		}
		finally {
			System.out.println("Take screenshots");
		}
	}

}

