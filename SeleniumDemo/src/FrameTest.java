import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		//driver.manage().window().maximize();
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //by classname locator
		//System.out.println(driver.findElements(By.tagName("iframe")).size()); //print how many iframe exists on the webpage
		//driver.switchTo().frame(0); //only one frame in the webpage
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//driver.findElement(By.id("draggable")).click();
	//	WebElement target = driver.findElement(By.id("droppable"));
		//target.click();
		
		//drag and drop
		
		Actions a= new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
	    WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
	    /* Actions builder = new Actions(driver);       
	    Action dragAndDrop = builder.clickAndHold(source) .pause(Duration.ofSeconds(5))
	           .moveToElement(target) .pause(Duration.ofSeconds(5))
	           .release() .pause(Duration.ofSeconds(5))
	           .build(); 
	    dragAndDrop.perform();
	    */
		a.dragAndDrop(source,target).build().perform();
		
		
		
		
		
		driver.close();

	}

}
