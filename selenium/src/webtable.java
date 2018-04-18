import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable {
	public static void main(String[] args ) throws InterruptedException{
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
	driver = new FirefoxDriver(); 
	driver.get("http://toolsqa.com/automation-practice-table/"); 
	Thread.sleep(3000);
	WebElement  parenttable=driver.findElement(By.xpath(".//*[@id='content']/table/tbody"));
	List<WebElement> allRow = parenttable.findElements(By.tagName("tr"));
	//List<WebElement> allcol = allRow.get(0).findElements(By.tagName("td"));
	//System.out.println(allcol.get(0).getText());
	//allcol.get(0).getText();
	//allcol.get(1).getText();
	for(int i =0;i<allRow.size();i++)
	{
		List<WebElement> allcol = allRow.get(i).findElements(By.tagName("td"));
		for(int j=0;j<allcol.size();j++)
		{
			System.out.print(allcol.get(j).getText());
		}
		System.out.println(  );
	}
		
}}

	
	
