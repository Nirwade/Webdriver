package test12;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			TakesScreenshot obj = (TakesScreenshot) driver;
			
			File file= obj.getScreenshotAs(OutputType.FILE);
			
				try {
					FileUtils.copyFile(file, new File("image2.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
	}

}
