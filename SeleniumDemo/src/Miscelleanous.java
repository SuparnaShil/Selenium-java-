import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
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
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //casting driver to take screenshots
		
		FileUtils.copyFile(src,new File ("C://Users//Suparna Shil//git//Selenium-java-//SeleniumDemo//src//screenshot.png"))  ;          //copy files from the src object to our local machine

	}

}
