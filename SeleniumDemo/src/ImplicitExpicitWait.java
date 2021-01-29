import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExpicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.trivago.com/");
		
		WebElement s = driver.findElement(By.id("querytext"));
		s.clear();
		s.sendKeys("Dha");
		Thread.sleep(5000);
		s.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.cssSelector(".btn.btn--primary.btn--regular.search-button.js-search-button")).click(); 
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'Hotel Sarina Dhaka')]"))));
		
		driver.findElement(By.xpath("//span[contains(text(),'Hotel Sarina Dhaka')]")).click();

		

	}

}
