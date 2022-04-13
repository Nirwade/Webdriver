package test12;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		 driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
         
         List<WebElement> web1 = driver.findElements(By.xpath("//table[@id='customers']//tr"));
         System.out.println("No of rows in table "+ web1.size());
List<WebElement> web2 = driver.findElements(By.xpath("//table[@id='customers']//td"));
System.out.println("no of elements in table.. "+ web2.size());
List<WebElement> web3 = driver.findElements(By.xpath("//table[@id='customers']//th"));
System.out.println("no of columns in table.. "+ web3.size());
List<WebElement> StrName = driver.findElements(By.xpath("//table[@id='customers']//tr/td"));

for (WebElement eln:StrName) {
	System.out.println("List of the elements in a table are "+ eln.getText());
	
}

List<WebElement> Colunm1 = driver.findElements(By.xpath("//table[@id='customers']//tr/td[1]"));
 for (WebElement eln2:Colunm1) {
	 System.out.println("List of colums are .."+eln2.getText());
	 
	 //alternate method to get the columns values
	 
	int column = 2; // Initialize a column values here
	 String Xpath = "//table[@id='customers']//tr/td[" + column + "]"; 
	 //create a dynamic xpath  
	 
	 List<WebElement> Columnrow = driver.findElements(By.xpath("//td[text()='Island Trading']/parent::tr/td"));
	 
	 for (WebElement eln3:Columnrow) {
		 System.out.println("List of column rows .."+ eln3.getText());
	 }
 
 }

}
	
	

	}


