package test12;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
	String FirstWin = driver.getWindowHandle();
	System.out.println("This is firstwin  "+FirstWin);
	
	WebElement NewTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
	NewTab.click();
	System.out.println("After clicking on the new window tab");
	
	Set <String> FirstWin1 = driver.getWindowHandles();
	Iterator<String> itr1 = FirstWin1.iterator();
	
	while(itr1.hasNext()) {
		String res = itr1.next();
		System.out.println("This is itr results: "+res);
		
		if(!res.equals(FirstWin)) {
			driver.switchTo().window(res);
			
		}
	}
	
	WebElement NewTab1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
    System.out.println("Final results "+NewTab1.getText());
    driver.close();
    
	driver.switchTo().window(FirstWin);
	System.out.println("Back to parent window");
	driver.close();

	
		

	}

}
