import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpicejetEndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");  
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@text='Delhi (DEL)']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();	
		Thread.sleep(2000);
        
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        
        if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5")) Assert.assertTrue(true);
		else Assert.assertTrue(false);
        
        driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		s.selectByIndex(5);
		
		Select currency= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currency.selectByVisibleText("USD");
		
		driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily")).click();
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}


