package test12;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.stylesheets.LinkStyle;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

 WebDriver driver = new ChromeDriver();
 //WebDriver driver = new FirefoxDriver();
 
 driver.get("https://www.simplilearn.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(400,TimeUnit.MILLISECONDS);
 
 WebDriverWait wait= new WebDriverWait(driver,50);

 WebElement loginlink = driver.findElement(By.className("login"));
 wait.until(ExpectedConditions.elementToBeClickable(loginlink));
 
// This is explicit wait //
 loginlink.click();
 
 WebElement Username = driver.findElement(By.name("user_login")); 
 WebElement password = driver.findElement(By.name("user_pwd")); 
 WebElement Remer = driver.findElement(By.className("rememberMe"));
 Remer.click();
 WebElement loginbtn = driver.findElement(By.name("btn_login")); 
  
 Username.sendKeys("123@smkfk.com");
 password.sendKeys("Abcd@1234");
 loginbtn.click();

 
 WebElement Errmsg = driver.findElement(By.id("msg_box"));
 String Actualmsg = Errmsg.getText();
 String Expectmgs = "The email or password you have entered is invalid.";
 if (Actualmsg.equals(Expectmgs)) {
	 System.out.println("TC passed");} else {
		 System.out.println("TC failed");
 }
List <WebElement> links = driver.findElements(By.tagName("a"));
System.out.println("Total number of links are  ..." + links.size());

for(WebElement ref:links) {
	System.out.println(ref.getAttribute("href"));
	
}	

 driver.close();

} 
	
}