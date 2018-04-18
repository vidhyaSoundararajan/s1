package selenium;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentRep {
static ExtentReports report;
static ExtentTest logger;
public static void main(String[] args) 
{
	
String userhome=System.getProperty("user.home");
String path = userhome+"\\Report\\Test.html";
 report =new ExtentReports(path);
 logger =report.startTest("login into SFDC");
 logger.log(LogStatus.PASS,"FireFox Browser launced");
 report.endTest(logger);
 report.flush();
 
 }}
