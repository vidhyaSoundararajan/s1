package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Demo3getattri {

static WebDriver driver;
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.salesforce.com/");
	WebElement login =driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
	 login.click();
	 
	 WebElement userName1 = driver.findElement(By.xpath(".//*[@id='username']"));
	 
	 userName1.sendKeys("vidhu.soundar@navita.com");
	 //System.out.println(userName1.getText());
	 String attributevalue =userName1.getAttribute("value");
	 System.out.println(attributevalue);
	 String attributevalue2 =userName1.getAttribute("id");
	 System.out.println(attributevalue2);
	 String attributevalue3 =userName1.getAttribute("type");
	 System.out.println(attributevalue3);
	 String attributevalue4 =userName1.getAttribute("style");
	 System.out.println(attributevalue4);
	 System.out.println("The user name is entered");
	 WebElement Password1 = driver.findElement(By.xpath(".//*[@id='password']"));
	 Password1.sendKeys("Tarun2010$");
	 String attributevalue5 =Password1.getAttribute("value");
	 System.out.println(attributevalue5);
	 String attributevalue6 =Password1.getAttribute("type");
	 System.out.println(attributevalue6);
	 String attributevalue7 =Password1.getAttribute("name");
	 System.out.println(attributevalue7);
	 System.out.println("password is entered");
	 WebElement LogIn =driver.findElement(By.xpath(".//*[@id='Login']"));
	LogIn.click();
	//WebElement err_msg=driver.findElement(By.xpath(".//*[@id='error']"));
	//System.out.println(err_msg.getText());
	//-------------------------------------------------
	
		
	
}
}
