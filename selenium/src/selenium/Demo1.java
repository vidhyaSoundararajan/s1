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


public class Demo1 {

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
	 WebElement Password1 = driver.findElement(By.xpath(".//*[@id='password']"));
	 Password1.sendKeys("Tarun2010$");
	 WebElement LogIn =driver.findElement(By.xpath(".//*[@id='Login']"));
	LogIn.click();
	WebElement err_msg=driver.findElement(By.xpath(".//*[@id='error']"));
	System.out.println(err_msg.getText());
	//-------------------------------------------------
	WebElement userName2 = driver.findElement(By.xpath(".//*[@id='username']"));
	System.out.println(userName2.getText());
	WebDriverWait wait2 = new WebDriverWait(driver,60);// 1 minute 
	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("userNavButton")));
	WebElement Navmenu =driver.findElement(By.xpath(".//*[@id='userNavButton']"));
		Navmenu.click();
		
	WebElement Logout1 = driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[5]"));
	Logout1.click();
	
	
}
}
