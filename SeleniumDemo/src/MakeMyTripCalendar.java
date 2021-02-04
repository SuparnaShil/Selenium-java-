import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripCalendar {

	static WebElement path;

	public static void daypicker(WebElement path2) {
		System.out.println("here1");
		List<WebElement> day = path2.findElements(By.xpath("//div[@class='dateInnerCell']/p[1]"));
		int count = path2.findElements(By.xpath("//div[@class='dateInnerCell']/p[1]")).size();

		for (int i = 0; i < count; i++) {
			String dayText = path2.findElements(By.xpath("//div[@class='dateInnerCell']/p[1]")).get(i).getText();
			System.out.println(dayText);
			if (dayText.equalsIgnoreCase("4")) {
				path2.findElements(By.xpath("//div[@class='dateInnerCell']/p[1]")).get(i).click();
				break;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.makemytrip.com/");
		Thread.sleep(6000);

		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();

		Thread.sleep(6000);

		while (!driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[1]")).getText()
				.contains("June")) {
			driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).click();

		}

		path = driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']/div[2]/div[1]"));
		daypicker(path);

		// grab the common attribute and put it in a list and iterate

	}

}
