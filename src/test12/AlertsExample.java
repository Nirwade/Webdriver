package test12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement Pop = driver.findElement(By.xpath("//button[@id='alertButton']"));
		Pop.click();
	//	===================================== Alert.. accept
		Alert alert = driver.switchTo().alert();
		System.out.println("This is the  message :"+alert.getText());
		alert.accept(); //clicks the pop-up message
		
//		===================================== Alert.. cancel	
		
		WebElement Pop1 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		Pop1.click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println("This is the  message :"+alert1.getText());
        alert1.dismiss(); // Cancel the pop-up message
        
//		===================================== Alert.. writing input
		WebElement Pop2 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		Pop2.click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.sendKeys("Nothing much");
		alert2.accept();
		driver.close();
        
	

	}

}
