package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportListener 
{
	
	public static ExtentReports config()
	{
	   String path = System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Clinic Automation Report");
		reporter.config().setDocumentTitle("Test Results");
		
		 ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Madhu H B");
		return extent;
	}
	
}
