import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercise {
	
	static int sumofRuns=0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/32238/pak-vs-rsa-3rd-t20i-south-africa-tour-of-pakistan-2021");
		/*
		 * URL may changes
		 */
		Thread.sleep(6000);
		//WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		WebElement table=driver.findElement(By.cssSelector(".cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		//System.out.println("1");
		
		int rowcount = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms")).size();
		
		//System.out.println(rowcount);
		Thread.sleep(6000);
		int count = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).size();
		
		//System.out.println(table.findElement(By.cssSelector("div[class='cb-col.cb-col-100.cb-scrd-itms'] div:nth-child(3)")));
		//int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		//System.out.println(count);
		
		for (int i=0; i<count-2; i++)
		{
			String run= table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText();
			sumofRuns+= Integer.parseInt(run);
		}
		//System.out.println(sumofRuns);
	    String val=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	    int extras = Integer.parseInt(val);
	    int total = sumofRuns+ extras;
	   // System.out.println(total);
		String printed= driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int printedTotal = Integer.parseInt(printed);
		
		if(total==printedTotal)
		{
			System.out.println("Count valided");
		}
		else
		{
			System.out.println("Count not valided");
		}
		
		
		

	}

}
