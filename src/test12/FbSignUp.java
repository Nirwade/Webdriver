package test12;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize(); //maximize the window
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); // wait time
        
        WebElement CreateNewAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        CreateNewAcc.click();
        
     /*   WebElement firstname = web1.findElement(By.xpath("//input[@name='firstname']"));
        WebElement surename = web1.findElement(By.xpath("//input[@name='lastname']"));
        WebElement MobileNum = web1.findElement(By.xpath("//input[@name='reg_email__']"));
        WebElement age = web1.findElement(By.xpath("//select[@name='birthday_day']"));
         
		firstname.sendKeys("shashi");
        surename.sendKeys("nirwa");
        MobileNum.sendKeys("8919635709");
        age.sendKeys("24"); */


        WebElement FirstName = driver.findElement(By.xpath("//input[@aria-label='First name']"));
        FirstName.click();
        WebElement LastName = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
        WebElement Email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));     
        FirstName.sendKeys("Donald");
        LastName.sendKeys("Kurangwa");
        Email.sendKeys("email@email.com");
        Password.sendKeys("355RD@hgf#");
        
        //input[@value='1']
        //input[@value='2']
        //input[@value='-1']
        
        //label[text()='Male']/following-sibling::input
        //label[text()='Female']/following-sibling::input
        //label[text()='Custom']/following-sibling::input

        
       String strgender = "Female";
     //label[text()='Custom']/following-sibling::input
       String genxpath = "//label[text()='"+  strgender + "']/following-sibling::input";
       WebElement gen = driver.findElement(By.xpath(genxpath));
       gen.click();
       
        List<WebElement> months = driver.findElements(By.xpath("//select[@title='Month']/option"));
         for (WebElement eln:months) {
        	 System.out.println(eln.getText());
        	 
            WebElement currmonths = driver.findElement(By.xpath("//select[@title='Month']/option[@selected='1']"));
            System.out.println(currmonths.getText());
            
            WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
            Select ddDay = new Select(Day);
            ddDay.selectByVisibleText("25");
            
            WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
            Select ddDay1 = new Select(month);
            ddDay1.selectByVisibleText("Jul");
            
            WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
            Select ddDay2 = new Select(year);
            ddDay2.selectByVisibleText("1995");
            
            

        	 
         }
         //List<WebElement> Days = driver.findElements(By.xpath(" //select[@title='Day']/option")); //select[@title='Day']/option
        // List<WebElement> Year = driver.findElements(By.xpath("//select[@title='Year']/option[@selected='1'")); //select[@title='Year']/option


	}

}
