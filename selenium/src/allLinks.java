//import java.awt.List;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class allLinks {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
		driver = new FirefoxDriver();  // Launch firefox browser
		driver.get("https://www.cnbc.com/");
		Thread.sleep(5000);
		List<WebElement> alllnk=driver.findElements(By.tagName("a"));
		System.out.print("Total number of links" + alllnk.size());
		
		//driver.manage().timeouts().implicitly Wait(10, TimeUnit.SECONDS); 
		for(int i=0;i<alllnk.size();i++)
		{
			String linkname = alllnk.get(i).getText();
			System.out.print("Link" + i + "name"+linkname);
			System.out.println();
		//if(linkname.equals("NEWS"));
		//{
			//	alllnk.get(i).click();
				//break;
			//}
			
			
		}
		
	}

}
