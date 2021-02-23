import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  //all cookies are deleted
		//driver.manage().deleteCookieNamed("abc"); // some specific cookie
		
		//session cookie
		//driver.manage().deleteCookieNamed("sessionKey");
		
		
		/*
		 * click on any lick
		 * login page- verify login url
		 * driver.manage().deleteCookieNamed("sessionKey");
		 */
		
		driver.get("https://google.com");
		
		

	}

}
