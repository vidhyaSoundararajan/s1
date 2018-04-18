import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demorep {

	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest logger;

	public static void main(String[] args) throws InterruptedException, AWTException {

		////loginToSFDC();
		//ForgotPwdA();
		//ForgotPwdB();
		//try {
			//Rememberme();
		//} catch (InterruptedException e) {
			//  // TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		//DeveloperconTC08();
		//MysettingTC07();
		//CreateAccTC10();
		//CreateviewTC11();
		//EditviewTC12();
		//MergeAccTC13();
		opporTc15();
	}

	public static void loginToSFDC(){
		System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
		String userHome = System.getProperty("user.home");
		String path = userHome+"\\Report\\Test.html";
		//String path = userHome+ "/Google Drive/Nov 13 2017/Read Only Folder/Framework/Report/loginToSFDC.html";
		report = new ExtentReports(path);
		logger = report.startTest("Login to SFDC");


		//System.setProperty("webdriver.gecko.driver","C:/Users/Abhis_lw0caw1/Google Drive/Nov 13 2017/Read Only Folder/Framework/Lib/geckodriver.exe");
		driver = new FirefoxDriver();  // Launch firefox browser
		System.out.println("Firefox browser is launched...");
		logger.log(LogStatus.INFO, "Firefox browser is launched...");

		driver.get("https://www.salesforce.com/");  // Launch the application
		System.out.println("Salesforce application is launched..");
		logger.log(LogStatus.INFO, "Salesforce application is launched..");

		WebElement login = driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
		login.click();
		System.out.println("Login button is clicked ");
		logger.log(LogStatus.INFO, "Login button is clicked ");


		/*Enter user name in user name field*/
		WebElement userName = driver.findElement(By.xpath(".//*[@id='username']"));
		enterText(userName, "user@gmail.com", "UserName");

		/*Enter pwd in pwd field*/
		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		enterText(password, "Password123", "Password");


		WebElement SFDClogin = driver.findElement(By.xpath(".//*[@id='Login']"));
		ClickButton(SFDClogin,"Login");
		//logger.log(LogStatus.INFO, "Login to SFDC button is clicked..");
         driver.quit();
		report.endTest(logger);
		report.flush();
	}

public static void ForgotPwdA()
{
	String userHome = System.getProperty("user.home");
	String path = userHome+"\\Report\\ForgotPwdA.html";
	report = new ExtentReports(path);
	logger = report.startTest("Login to SDFC");
	System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
	driver = new FirefoxDriver();  // Launch firefox browser
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	driver.get("https://www.salesforce.com/");  // Launch the application
	System.out.println("Salesforce application is launched..");
	logger.log(LogStatus.INFO, "Salesforce application is launched..");
	WebElement login = driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
	ClickButton(login,"login");
	System.out.println("Login button is clicked ");
	logger.log(LogStatus.INFO, "Login button is clicked ");
	WebElement forgotPwd = driver.findElement(By.xpath("//*[@id='forgot_password_link']"));
	ClickButton(forgotPwd, "forgot pwd");
	WebElement Un = driver.findElement(By.xpath("//*[@id='un']"));
	enterText(Un,"vidhu.soundar@navit.com","Username");
	WebElement ContinueButton=driver.findElement(By.xpath("//*[@id='continue']"));
	ClickButton(ContinueButton,"Continue");
	driver.quit();
	report.endTest(logger);
	report.flush();
	
}
public static void ForgotPwdB()
{
	String userHome = System.getProperty("user.home");
	String path = userHome+"\\Report\\ForgotPwdB.html";
	report = new ExtentReports(path);
	logger = report.startTest("Login to SDFC");
	System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
	driver = new FirefoxDriver();  // Launch firefox browser
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	driver.get("https://www.salesforce.com/");  // Launch the application
	System.out.println("Salesforce application is launched..");
	logger.log(LogStatus.INFO, "Salesforce application is launched..");
	WebElement login = driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
	ClickButton(login,"login");
	System.out.println("Login button is clicked ");
	logger.log(LogStatus.INFO, "Login button is clicked ");
	/*Enter user name in user name field*/
	WebElement userName = driver.findElement(By.xpath(".//*[@id='username']"));
	enterText(userName, "123", "UserName");

	/*Enter pwd in pwd field*/
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	enterText(password, "22131", "Password");
	
	WebElement SFDClogin = driver.findElement(By.xpath(".//*[@id='Login']"));
	ClickButton(SFDClogin,"Login");
	//logger.log(LogStatus.INFO, "Login to SFDC button is clicked..");
     //driver.quit();
	report.endTest(logger);
	report.flush();
	
}
// TC09  same
public static void Rememberme() throws InterruptedException{
	String userHome = System.getProperty("user.home");
	String path = userHome+"\\Report\\Remember.html";
	report = new ExtentReports(path);
	logger = report.startTest("Login to SDFC");
	System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
	driver = new FirefoxDriver();  // Launch firefox browser
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	driver.get("https://www.salesforce.com/");  // Launch the application
	System.out.println("Salesforce application is launched..");
	logger.log(LogStatus.INFO, "Salesforce application is launched..");
	WebElement login = driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
	ClickButton(login,"login");
	System.out.println("Login button is clicked ");
	logger.log(LogStatus.INFO, "Login button is clicked ");
	/*Enter user name in user name field*/
	WebElement userName = driver.findElement(By.xpath(".//*[@id='username']"));
	enterText(userName, "vidhu.soundar@navita.com", "UserName");

	/*Enter pwd in pwd field*/
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	enterText(password, "vidhya1980", "Password");
	/// Rememberme Button
	WebElement Rememberme = driver.findElement(By.xpath(".//*[@id='rememberUn']"));
	ClickButton(Rememberme,"Rememberme");
	logger.log(LogStatus.INFO, "Rememberme is clicked ");
	WebElement SFDClogin = driver.findElement(By.xpath(".//*[@id='Login']"));
	ClickButton(SFDClogin,"Login");
	logger.log(LogStatus.INFO, "Login  is clicked ");
	Thread.sleep(3000);
	//logger.log(LogStatus.INFO, "Login to SFDC button is clicked..");
	WebElement downArrow = driver.findElement(By.xpath(".//*[@id='userNav-arrow']"));
	ClickButton(downArrow,"downArrow");
	WebElement Logout = driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[5]"));
	ClickButton(Logout,"Logout");
	logger.log(LogStatus.INFO, "Logout button is clicked ");
	Thread.sleep(3000);
	String value = driver.findElement(By.name("username")).getAttribute("value");
	System.out.print(value);
	if(value.equals("vidhu.soundar@navita.com"))
	{
		logger.log(LogStatus.INFO, "username  is displayed ");
		System.out.println("Done");
	}
	logger.log(LogStatus.INFO, "username  is displayed ");
   // System.out.println("Done");
	report.endTest(logger);
	report.flush();
}



public static void DeveloperconTC08() throws InterruptedException, AWTException{
	String userHome = System.getProperty("user.home");
	String path = userHome+"\\Report\\Devconsole.html";
	report = new ExtentReports(path);
	logger = report.startTest("Login to SDFC");
	System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
	driver = new FirefoxDriver();  // Launch firefox browser
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	driver.get("https://www.salesforce.com/");  // Launch the application
	System.out.println("Salesforce application is launched..");
	logger.log(LogStatus.INFO, "Salesforce application is launched..");
	WebElement login = driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
	ClickButton(login,"login");
	System.out.println("Login button is clicked ");
	logger.log(LogStatus.INFO, "Login button is clicked ");
	/*Enter user name in user name field*/
	WebElement userName = driver.findElement(By.xpath(".//*[@id='username']"));
	enterText(userName, "vidhu.soundar@navita.com", "UserName");

	/*Enter pwd in pwd field*/
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	enterText(password, "vidhya1980", "Password");
	/// Rememberme Button
	WebElement Rememberme = driver.findElement(By.xpath(".//*[@id='rememberUn']"));
	ClickButton(Rememberme,"Rememberme");
	
	WebElement SFDClogin = driver.findElement(By.xpath(".//*[@id='Login']"));
	ClickButton(SFDClogin,"Login");
	Thread.sleep(3000);
	//logger.log(LogStatus.INFO, "Login to SFDC button is clicked..");
	WebElement downArrow = driver.findElement(By.xpath(".//*[@id='userNav-arrow']"));
	ClickButton(downArrow,"downArrow");
	WebElement Devconsole = driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[3]"));
	ClickButton(Devconsole,"Devconsole");
	
	//press Alt +F4 to close the window
	Thread.sleep(5000);
	//Keyboard keyboard=((HasInputDevices)driver).getKeyboard();
	//keyboard.pressKey(Keys.ALT);
	//keyboard.pressKey(Keys.F4);
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_ALT);
	rb.keyPress(KeyEvent.VK_F4);
	rb.keyRelease(KeyEvent.VK_ALT);
	rb.keyRelease(KeyEvent.VK_F4);
	report.endTest(logger);
	report.flush();
}

public static void MysettingTC07() throws InterruptedException, AWTException{
	String userHome = System.getProperty("user.home");
	String path = userHome+"\\Report\\Mysetting07.html";
	report = new ExtentReports(path);
	logger = report.startTest("Login to SDFC");
	System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
	driver = new FirefoxDriver();  // Launch firefox browser
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	driver.get("https://www.salesforce.com/");  // Launch the application
	System.out.println("Salesforce application is launched..");
	logger.log(LogStatus.INFO, "Salesforce application is launched..");
	WebElement login = driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
	ClickButton(login,"login");
	System.out.println("Login button is clicked ");
	logger.log(LogStatus.INFO, "Login button is clicked ");
	/*Enter user name in user name field*/
	WebElement userName = driver.findElement(By.xpath(".//*[@id='username']"));
	enterText(userName, "vidhu.soundar@navita.com", "UserName");

	/*Enter pwd in pwd field*/
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	enterText(password, "vidhya1980", "Password");
	
	
	WebElement SFDClogin = driver.findElement(By.xpath(".//*[@id='Login']"));
	ClickButton(SFDClogin,"Login");
	Thread.sleep(3000);
	//logger.log(LogStatus.INFO, "Login to SFDC button is clicked..");
	WebElement downArrow = driver.findElement(By.xpath(".//*[@id='userNav-arrow']"));
	ClickButton(downArrow,"downArrow");
	WebElement MySetting = driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[2]"));
	ClickButton(MySetting,"MySetting");
	
	WebElement Perinfo = driver.findElement(By.xpath(".//*[@id='PersonalInfo']/a"));
	ClickButton(Perinfo,"Perinfo");
	
	WebElement LoginHistory = driver.findElement(By.xpath(".//*[@id='LoginHistory_font']"));
	ClickButton(LoginHistory,"LoginHistory");
	WebElement RelHistory = driver.findElement(By.xpath(".//*[@id='RelatedUserLoginHistoryList_body']/div/a"));
	ClickButton(RelHistory,"RelHistory");
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_ALT);
	rb.keyPress(KeyEvent.VK_F4);
	rb.keyRelease(KeyEvent.VK_ALT);
	rb.keyRelease(KeyEvent.VK_F4);
	WebElement DisLayout = driver.findElement(By.xpath(".//*[@id='DisplayAndLayout_font']"));
	ClickButton(DisLayout,"DisLayout");
	WebElement CusTab = driver.findElement(By.xpath(".//*[@id='CustomizeTabs_font']"));
	ClickButton(CusTab,"CusTab");
	System.out.println("custab is clicked");
	//sales chatter
	//Select dropdown = new Select(driver.findElement(By.name("p4")));
	Select select = new Select(driver.findElement(By.id("p4")));
	select.selectByVisibleText("Salesforce Chatter");
	System.out.println("Salesforce Chatter is clicked");
	Thread.sleep(3000);
	WebElement Report = driver.findElement(By.xpath(".//*[@id='duel_select_0']/option[30]"));
	ClickButton(Report,"Report");
	// reports =.//*[@id='duel_select_0']/option[30]
	// Email 
	WebElement Emailsetup = driver.findElement(By.xpath(".//*[@id='EmailSetup']/a"));
	ClickButton(Emailsetup,"Emailsetup");
	/// Email Setting
	WebElement Emailsetting = driver.findElement(By.xpath(".//*[@id='EmailSettings_font']"));
	ClickButton(Emailsetting,"Emailsetting");
	//save button
	
	WebElement Savebutton = driver.findElement(By.xpath(".//*[@id='bottomButtonRow']/input[1]"));
	ClickButton(Savebutton,"Savebutton");
	System.out.print("save button is clicked");
	/// Calender and Rem
	
	Thread.sleep(5000);
	WebElement CalRem = driver.findElement(By.xpath(".//*[@id='CalendarAndReminders_font']"));
	ClickButton(CalRem,"CalRem");
	//REmainders
	System.out.print("Calender is clicked");
	WebElement Remainders = driver.findElement(By.xpath(".//*[@id='Reminders_font']"));
	ClickButton(Remainders,"Remainders");
	System.out.print("remainder is clicked");
	Thread.sleep(5000);
	//save Button
	WebElement Savebutton1 = driver.findElement(By.xpath(".//*[@id='bottomButtonRow']/input[1]"));
	ClickButton(Savebutton1,"Savebutton1");
	report.endTest(logger);
	report.flush();
}

public static void CreateAccTC10() throws InterruptedException{
	String userHome = System.getProperty("user.home");
	String path = userHome+"\\Report\\CreateAccount.html";
	report = new ExtentReports(path);
	logger = report.startTest("Login to SDFC");
	System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
	driver = new FirefoxDriver();  // Launch firefox browser
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	driver.get("https://www.salesforce.com/");  // Launch the application
	System.out.println("Salesforce application is launched..");
	logger.log(LogStatus.INFO, "Salesforce application is launched..");
	WebElement login = driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
	ClickButton(login,"login");
	System.out.println("Login button is clicked ");
	logger.log(LogStatus.INFO, "Login button is clicked ");
	/*Enter user name in user name field*/
	WebElement userName = driver.findElement(By.xpath(".//*[@id='username']"));
	enterText(userName, "vidhu.soundar@navita.com", "UserName");

	/*Enter pwd in pwd field*/
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	enterText(password, "vidhya1980", "Password");
	/// Rememberme Button
	WebElement Rememberme = driver.findElement(By.xpath(".//*[@id='rememberUn']"));
	ClickButton(Rememberme,"Rememberme");
	logger.log(LogStatus.INFO, "Rememberme is clicked ");
	WebElement SFDClogin = driver.findElement(By.xpath(".//*[@id='Login']"));
	ClickButton(SFDClogin,"Login");
	Thread.sleep(6000);
	WebElement AccTab = driver.findElement(By.xpath(".//*[@id='Account_Tab']"));
	ClickButton(AccTab,"AccTab");
	WebElement Newtab = driver.findElement(By.xpath(".//*[@id='createNewButton']"));
	ClickButton(Newtab,"Newtab");
	System.out.println("new tab is selected");
	WebElement NAccount = driver.findElement(By.xpath(".//*[@id='createNewMenu']/a[3]"));
	ClickButton(NAccount,"NAccount");
	System.out.println("new Account is selected");
	
	WebElement userName1 = driver.findElement(By.xpath(".//*[@id='acc2']"));
	 
	 userName1.sendKeys("John");
	/// save the user 
	 System.out.println("name is given");
	 WebElement Nuser = driver.findElement(By.xpath(".//*[@id='bottomButtonRow']/input[1]"));
		ClickButton(Nuser,"Nuser");
		System.out.println("name is saved");
	 
	report.endTest(logger);
	report.flush();
}
// create new view
public static void CreateviewTC11() throws InterruptedException{
	String userHome = System.getProperty("user.home");
	String path = userHome+"\\Report\\CreateviewTc11.html";
	report = new ExtentReports(path);
	logger = report.startTest("Login to SDFC");
	System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
	driver = new FirefoxDriver();  // Launch firefox browser
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	driver.get("https://www.salesforce.com/");  // Launch the application
	System.out.println("Salesforce application is launched..");
	logger.log(LogStatus.INFO, "Salesforce application is launched..");
	WebElement login = driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
	ClickButton(login,"login");
	System.out.println("Login button is clicked ");
	logger.log(LogStatus.INFO, "Login button is clicked ");
	/*Enter user name in user name field*/
	WebElement userName = driver.findElement(By.xpath(".//*[@id='username']"));
	enterText(userName, "vidhu.soundar@navita.com", "UserName");

	/*Enter pwd in pwd field*/
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	enterText(password, "vidhya1980", "Password");
	/// Rememberme Button
	WebElement Rememberme = driver.findElement(By.xpath(".//*[@id='rememberUn']"));
	ClickButton(Rememberme,"Rememberme");
	logger.log(LogStatus.INFO, "Rememberme is clicked ");
	WebElement SFDClogin = driver.findElement(By.xpath(".//*[@id='Login']"));
	ClickButton(SFDClogin,"Login");
	Thread.sleep(6000);
	WebElement AccTab = driver.findElement(By.xpath(".//*[@id='Account_Tab']"));
	ClickButton(AccTab,"AccTab");
	
	WebElement newview = driver.findElement(By.xpath(".//*[@id='filter_element']/div/span/span[2]/a[2]"));
	ClickButton(newview,"newview");
	Thread.sleep(3000);
	WebElement viewname = driver.findElement(By.xpath(".//*[@id='fname']"));
	viewname.sendKeys("gt");
	WebElement uviewname = driver.findElement(By.xpath(".//*[@id='devname']"));
	uviewname.sendKeys("gtpp");
	Thread.sleep(2000);
	WebElement saveview = driver.findElement(By.xpath(".//*[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[1]"));
	
	ClickButton(saveview,"saveview");
	System.out.println("Done");
	report.endTest(logger);
	report.flush();
}

public static void EditviewTC12() throws InterruptedException{
	String userHome = System.getProperty("user.home");
	String path = userHome+"\\Report\\EditviewTc12.html";
	report = new ExtentReports(path);
	logger = report.startTest("Login to SDFC");
	System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
	driver = new FirefoxDriver();  // Launch firefox browser
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	driver.get("https://www.salesforce.com/");  // Launch the application
	System.out.println("Salesforce application is launched..");
	logger.log(LogStatus.INFO, "Salesforce application is launched..");
	WebElement login = driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
	ClickButton(login,"login");
	System.out.println("Login button is clicked ");
	logger.log(LogStatus.INFO, "Login button is clicked ");
	/*Enter user name in user name field*/
	WebElement userName = driver.findElement(By.xpath(".//*[@id='username']"));
	enterText(userName, "vidhu.soundar@navita.com", "UserName");

	/*Enter pwd in pwd field*/
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	enterText(password, "vidhya1980", "Password");
	/// Rememberme Button
	WebElement Rememberme = driver.findElement(By.xpath(".//*[@id='rememberUn']"));
	ClickButton(Rememberme,"Rememberme");
	logger.log(LogStatus.INFO, "Rememberme is clicked ");
	WebElement SFDClogin = driver.findElement(By.xpath(".//*[@id='Login']"));
	ClickButton(SFDClogin,"Login");
	Thread.sleep(6000);
	WebElement AccTab = driver.findElement(By.xpath(".//*[@id='Account_Tab']"));
	ClickButton(AccTab,"AccTab");
	//WebElement view = driver.findElement(By.xpath(".//*[@id='fcf']"));
	//ClickButton(view,"view");
	Select select = new Select(driver.findElement(By.id("fcf")));
	select.selectByVisibleText("gt");
	System.out.println("gt is selcted");
	//edit 
	Thread.sleep(1000);
	WebElement Editview = driver.findElement(By.xpath(".//*[@id='filter_element']/div/span/span[2]/a[1]"));
	ClickButton(Editview,"Editview");
	System.out.println("Edit is selcted");
	
	//new name
	WebElement newview = driver.findElement(By.xpath(".//*[@id='fname']"));
	newview.sendKeys("gt11");
	//select Account name
	Select select1 = new Select(driver.findElement(By.id("fcol1")));
	select1.selectByVisibleText("Account Name");
	Select select2 = new Select(driver.findElement(By.id("fop1")));
	select2.selectByVisibleText("equals");
	WebElement select3 = driver.findElement(By.id("fval1"));
	select3.sendKeys("equ");
	
	///add
	WebElement add = driver.findElement(By.xpath(".//*[@id='bool_filter_toggle']"));
	ClickButton(add,"add");
	
	
	//save
	WebElement save = driver.findElement(By.xpath(".//*[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[1]"));
	ClickButton(save,"save");
	
	System.out.println("done");
	report.endTest(logger);
	report.flush();
}


public static void MergeAccTC13() throws InterruptedException{
	String userHome = System.getProperty("user.home");
	String path = userHome+"\\Report\\MergeAccTC13.html";
	report = new ExtentReports(path);
	logger = report.startTest("Login to SDFC");
	System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
	driver = new FirefoxDriver();  // Launch firefox browser
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	driver.get("https://www.salesforce.com/");  // Launch the application
	System.out.println("Salesforce application is launched..");
	logger.log(LogStatus.INFO, "Salesforce application is launched..");
	WebElement login = driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
	ClickButton(login,"login");
	System.out.println("Login button is clicked ");
	logger.log(LogStatus.INFO, "Login button is clicked ");
	/*Enter user name in user name field*/
	WebElement userName = driver.findElement(By.xpath(".//*[@id='username']"));
	enterText(userName, "vidhu.soundar@navita.com", "UserName");

	/*Enter pwd in pwd field*/
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	enterText(password, "vidhya1980", "Password");
	/// Rememberme Button
	WebElement Rememberme = driver.findElement(By.xpath(".//*[@id='rememberUn']"));
	ClickButton(Rememberme,"Rememberme");
	logger.log(LogStatus.INFO, "Rememberme is clicked ");
	WebElement SFDClogin = driver.findElement(By.xpath(".//*[@id='Login']"));
	ClickButton(SFDClogin,"Login");
	Thread.sleep(6000);
	WebElement AccTab = driver.findElement(By.xpath(".//*[@id='Account_Tab']"));
	ClickButton(AccTab,"AccTab");
	//merge link
	WebElement mergeAcc = driver.findElement(By.xpath(".//*[@id='toolsContent']/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
	ClickButton(mergeAcc,"mergeAcc");
	WebElement Accrec = driver.findElement(By.xpath(".//*[@id='srch']"));
	Accrec.sendKeys("John");
	
	WebElement FindAcc = driver.findElement(By.xpath(".//*[@id='stageForm']/div/div[2]/div[4]/input[2]"));
	ClickButton(FindAcc,"FindAcc");
	WebElement Accrec1 = driver.findElement(By.xpath(".//*[@id='srch']"));
	Accrec1.sendKeys("John1");
	WebElement FindAcc1 = driver.findElement(By.xpath(".//*[@id='stageForm']/div/div[2]/div[4]/input[2]"));
	ClickButton(FindAcc1,"FindAcc1");
	WebElement Next = driver.findElement(By.xpath(".//*[@id='stageForm']/div/div[2]/div[5]/div/input[1]"));
	ClickButton(Next,"Next");
	System.out.println("next is clicked");
	Thread.sleep(2000);
	
	WebElement MergeAcc = driver.findElement(By.xpath(".//*[@id='stageForm']/div/div[2]/div[5]/div/input[2] "));
	ClickButton(MergeAcc,"MergeAcc");
	System.out.println("merge is clicked");
	Alert alert = driver.switchTo().alert();
	alert.accept();
	System.out.println("Done");
	report.endTest(logger);
	report.flush();
}

public static void opporTc15() throws InterruptedException {
	String userHome = System.getProperty("user.home");
	String path = userHome+"\\Report\\opporTc15.html";
	report = new ExtentReports(path);
	logger = report.startTest("Login to SDFC");
	System.setProperty("webdriver.gecko.driver","C:/Users/Nandakumar/geckodriver.exe");
	driver = new FirefoxDriver();  // Launch firefox browser
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	driver.get("https://www.salesforce.com/");  // Launch the application
	System.out.println("Salesforce application is launched..");
	logger.log(LogStatus.INFO, "Salesforce application is launched..");
	WebElement login = driver.findElement(By.xpath("html/body/header/div[2]/div/div[3]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a"));
	ClickButton(login,"login");
	System.out.println("Login button is clicked ");
	logger.log(LogStatus.INFO, "Login button is clicked ");
	/*Enter user name in user name field*/
	WebElement userName = driver.findElement(By.xpath(".//*[@id='username']"));
	enterText(userName, "vidhu.soundar@navita.com", "UserName");

	/*Enter pwd in pwd field*/
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	enterText(password, "vidhya1980", "Password");
	/// Rememberme Button
	WebElement Rememberme = driver.findElement(By.xpath(".//*[@id='rememberUn']"));
	ClickButton(Rememberme,"Rememberme");
	
	WebElement SFDClogin = driver.findElement(By.xpath(".//*[@id='Login']"));
	ClickButton(SFDClogin,"Login");
	Thread.sleep(6000);
	// Opportunity Tab
	WebElement opptab = driver.findElement(By.xpath(".//*[@id='Opportunity_Tab']"));
	ClickButton(opptab,"opptab");
	
	WebElement oppview = driver.findElement(By.xpath(".//*[@id='fcf']"));
	ClickButton(oppview,"oppview");
	System.out.println("Done");
	report.endTest(logger);
	report.flush();
}
	public static void enterText(WebElement obj, String textVal, String objName){
		if(obj.isDisplayed()){
			obj.sendKeys(textVal);
			logger.log(LogStatus.PASS, textVal+ " is entered in "+ objName +" field.");
			System.out.println("Pass: user name is entered in user name field");
		}else{
			logger.log(LogStatus.FAIL, objName+ " field is not displayed, please check your application");
			System.out.println("Fail: UserName field is not displayed please check your application");
		}
	}
		public static void ClickButton(WebElement obj,String objName){
			if(obj.isDisplayed()){
				obj.click();
				logger.log(LogStatus.PASS, objName +" is clicked");
				
			}
			else{
				logger.log(LogStatus.FAIL, objName+ " field is not displayed, please check your application");

			}
	}
}



