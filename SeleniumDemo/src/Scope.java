import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// count of links in web page
		// any link will have tag name anchor <a  />
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//footer section
		
		WebElement footerDriver =driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//footersection's First column
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table//tbody/tr/td[1]/ul")); 
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//click on each link and check if the pages are opening
		
		for (int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++) //i=1 because here we dont want to enter the first link 
		{
			/*
			//click on links
			columnDriver.findElements(By.tagName("a")).get(i).click();
			System.out.println(driver.getTitle());
			//but should back to the main link
			 * 
			 */
			
			
			//right method
			String controlLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(controlLink); //dont click on it
		
			
 			 
		}
		
		
		Set<String> id= driver.getWindowHandles();
			Iterator<String> it = id.iterator();
			
			//open all tab move to that tabs and print the title of the child tab
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
		
		
		

	}

}
