import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HttpsCertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * customizing chrome driver by providing options
		 * DesiredCapabilites is a class which helps to customize the chrome browser
		 */
		
		//general capabilities
		DesiredCapabilities ch =DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();    //comment out this when set capabilities add added
		
		//capabilities for local browser
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions co= new ChromeOptions();
		co.merge(ch);
		
		//Now pass this customized chrome options to the webdriver element
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		
		/*
		 * Now this customized driver when faces any certification issue then click on proceed anyway or any positive button
		 */
	}

}
