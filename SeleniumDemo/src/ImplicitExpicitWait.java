import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitExpicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trivago.com/");
		
		WebElement s = driver.findElement(By.id("querytext"));
		s.clear();
		s.sendKeys("Dha");
		s.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector(".btn.btn--primary.btn--regular.search-button.js-search-button")).click();

		

	}

}
