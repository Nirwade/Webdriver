package test12;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
			WebDriver driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
			driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0");    
			
			//Maximize window
			driver.manage().window().maximize();
			
			//wait for browser to load - implicit
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			
			TakesScreenshot obj = (TakesScreenshot) driver;
			
			File file = obj.getScreenshotAs(OutputType.FILE);
			
		
				FileUtils.copyFile(file, new File("image3.png"));
			System.out.println("Program successful");
	}

}

