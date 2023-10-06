package doctorLogin;

import org.testng.annotations.Test;

import extentReportsPage.Retry;
import genericUtilities.BaseClass;
import objectRepositoryDoctorLogin.ConsultTypeInReports;
import objectRepositoryDoctorLogin.DoctorLoginPage;
import objectRepositoryDoctorLogin.DoctorOverviewInDL;
import objectRepositoryDoctorLogin.ExportInReports;
import objectRepositoryDoctorLogin.GenderDropdownInReports;
import objectRepositoryDoctorLogin.ReportsTabInDL;
import objectRepositoryDoctorLogin.ViewInReportsPage;



public class DoctorReportsPage extends BaseClass
{
	@Test(priority = 1)
	public void LoginReportsPage() throws InterruptedException
	{
		ReportsTabInDL report=new ReportsTabInDL(driver);
		report.reporttab();
		report.reportstab1();
		report.Hamburger();
		report.Crossicon();
	}
	@Test(priority = 2,retryAnalyzer=Retry.class)
	public void DoctorOverviewPage() throws InterruptedException
	{
		DoctorOverviewInDL over=new DoctorOverviewInDL(driver);
		over.dropdownDL();
		over.currentYear();
		over.currentMonth();
		over.currentWeek();
		over.currentDay();
		over.selectdate(prop.getProperty("date"));
		over.ConfirmButton();
	}
	@Test(priority = 3)
	public void ViewDropdown() throws InterruptedException
	{
		ViewInReportsPage vr=new ViewInReportsPage(driver);
		vr.viewdropdown();
		vr.alldropdown();
	}
	@Test(priority = 4)
	public void GenderDropdown() throws InterruptedException
	{
		GenderDropdownInReports gd=new GenderDropdownInReports(driver);
		gd.genderdropdown();
		gd.maledropdown();
		gd.femaledropdown();
	}
	@Test(priority = 5)
	public void ConsultTypePage() throws InterruptedException
	{
		ConsultTypeInReports ct=new ConsultTypeInReports(driver);
		ct.ConsultType();
		ct.Audiocall();
		ct.Videocall();
		ct.Normalcall();
	}
	@Test(priority = 6)
	public void ExportPage() throws InterruptedException
	{
		ExportInReports expo=new ExportInReports(driver);
		expo.Exports();
		expo.clickbutton();
		expo.clickExport();
	}
}
