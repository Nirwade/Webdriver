package test12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
			WebDriver driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
			driver.get("https://demo.guru99.com/test/upload/");    
			
			//Maximize window
			driver.manage().window().maximize();
			
			//wait for browser to load - implicit
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
			upload.sendKeys("C:\\Users\\home\\Desktop");

			WebElement Trms = driver.findElement(By.id("terms"));
			Trms.click();
			
			WebElement submit = driver.findElement(By.id("submitbutton"));
			submit.click();
			
	}

}
