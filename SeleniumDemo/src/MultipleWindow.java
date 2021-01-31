import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/challenge/pwd?continue=https%3A%2F%2Fmyaccount.google.com%2Fsigninoptions%2Fphone-sign-in&service=accountsettings&osid=1&rart=ANgoxcdxv5x1q3KR4W4aNnUaD1Eeb0SZCUKbi8LN1w8KGB-lNDMFe8jm_yuj_pzOWpkO9hY541fIrA84ov696zN7nimFfRNi_g&TL=AM3QAYbhmuNQ9h3WjLEz6OnsbIHJgZWDfjYi575Rr9cpA4NoEtIHFIF_Bbvaqu87&flowName=GlifWebSignIn&cid=1&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		System.out.println(driver.getTitle());
		driver.getWindowHandles();

	}

}
