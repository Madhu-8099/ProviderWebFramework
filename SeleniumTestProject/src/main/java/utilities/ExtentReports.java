package utilities;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports 
{
	public void getReportObject()
	{
		String path = System.getProperty("user.dir")+"index.html";
		ExtentSparkReporter reporter1=new ExtentSparkReporter(path);
		reporter1.config().setReportName("DoctorDashboard Automation Report");
		reporter1.config().setDocumentTitle("Test Results");
		
		 ExtentReports report=new ExtentReports();
		 
	}

}
