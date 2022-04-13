package test12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS );
		
		WebElement ID = driver.findElement(By.xpath("//input[@name='email']"));   //tagname[@attribute='value'] this is relative xpath
		ID.sendKeys("shashi@1293725721gmail.com");
		WebElement passward = driver.findElement(By.xpath("//input[@type='password']"));  //button[@name="login"]
		passward.sendKeys("abcd@A12344");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		WebElement errmsg = driver.findElement(By.xpath("//div[@class ='_9ay7']"));
		String Actualmgs = errmsg.getText();
		String Expectedmgs = "The email address you entered isn't connected to an account.Find your account and log in.";
		if(Actualmgs.equals(Expectedmgs)) {
			System.out.println("this is valid, test case successfull...");}else {
				System.out.println("this is invalid, unsuccessful test case");
		}
		
		driver.close();
				
	}

}
