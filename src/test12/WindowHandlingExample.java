package test12;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
	String ParentWin = driver.getWindowHandle(); //prints a unique string value for single window
	System.out.println("Before clicking on the new window button: "+ParentWin);
	
	WebElement Windw = driver.findElement(By.xpath("//button[@id='windowButton']"));
	Windw.click();
	
	System.out.println("After clicking on the new window button");

	Set<String> ChildWin =driver.getWindowHandles();
    Iterator<String> itr = ChildWin.iterator();
    
	while (itr.hasNext()) {
		
	String currentval = itr.next();
		System.out.println(currentval);
		
	if(!currentval.equals(ParentWin)) {
		driver.switchTo().window(currentval);	
	}
	}
	
	WebElement NewCdWin = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
    System.out.println("Final view of new window button with string value " +NewCdWin.getText());
     //prints a set of unique string values for multiple windows
		driver.close();
		 
		driver.switchTo().window(ParentWin);
		System.out.println("Back to parent window");
		driver.close();
	}
		
	}

