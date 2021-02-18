 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImNotRobotCaptcha {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/recaptcha/api2/demo");
		Thread.sleep(6000);
		
		int number= findframeID(driver,By.className("recaptcha-checkbox-border"));
		 driver.switchTo().frame(number);
		 driver.findElement(By.xpath( " //span[@id='recaptcha-anchor']" )).click();

		/*
		 * 
		 * System.out.println(driver.findElements(By.tagName("iframe")).size());
		 * driver.switchTo().frame(0);
		 * driver.findElement(By.className("recaptcha-checkbox-border")).click();
		 * driver.switchTo().frame(driver.findElement(By.
		 * cssSelector("iframe[title='recaptcha challenge']")));
		 * driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
		 */

	}

	public static int findframeID(WebDriver driver, By by)

	{
		int framecount = driver.findElements(By.tagName("iframe")).size();
		int i;

		for (i = 0; i < framecount; i++) {
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			if (count > 0) {
				//driver.findElement(by).click();   //span[@id='recaptcha-anchor']
				break;
			}   else
				System.out.println("looping continue");
		}

		driver.switchTo().defaultContent();

		return i;

	}

}
