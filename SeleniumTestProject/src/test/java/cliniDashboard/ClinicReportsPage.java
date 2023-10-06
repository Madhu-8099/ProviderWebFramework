package cliniDashboard;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.AppointmentInCR;
import objectRepository.ClinicOverviewInCR;
import objectRepository.ClinicReports;
import objectRepository.DoctorOverviewInCR;
import objectRepository.Loginpage1;
import objectRepository.LogoutPage;
import objectRepositoryDemo.MobileVerificationPage;

public class ClinicReportsPage extends BaseClass
{
	
	@Test(priority = 1)
	public void ClinicReportsPage() throws InterruptedException
	{
		ClinicReports cr=new ClinicReports(driver);
		cr.CliniReports();
		cr.ClinicReports1();
		cr.Hamurger();
		cr.crossIcon();
	}
	@Test(priority = 2)
	public void ClinicOverviewDropdown() throws InterruptedException
	{
		ClinicOverviewInCR cov=new ClinicOverviewInCR(driver);
		cov.YearDropdown();
		cov.CurrentYear();
		cov.CurrentMonth();
		cov.CurrentWeek();
		cov.CurrentDay();
		cov.DatePage(prop.getProperty("Date"));
		cov.Confirm_button();
	}
	@Test(priority = 3)
	public void DoctorOverviewDetails() throws InterruptedException
	{
		DoctorOverviewInCR doc=new DoctorOverviewInCR(driver);
		doc.Doctor_dropdown1();
		doc.FirstDoctor1();
		doc.Year_Dropdown1();
		doc.Current_Year();
		doc.Current_Month();
		doc.Current_Week();
		doc.Custom1();
	}
	@Test(priority = 4)
	public void AppointmentPageInCR() throws InterruptedException
	{
		AppointmentInCR ac=new AppointmentInCR(driver);
		ac.View1();
		ac.All1();
		ac.Age1();
		ac.Symptoms1();
		ac.Doctor1();
		ac.Type1();
		ac.ConsultType1();
		ac.Status1();
		ac.Consult_Fee1();
		ac.Schedule1();
		ac.PhoneNumber1();
	}
	@Test(priority =5)
	 public void Logout() throws InterruptedException {
	 LogoutPage lp1=new LogoutPage(driver);
	 lp1.Logoutbutton();lp1.logOut();lp1.Hamburger();lp1.crossbutton();lp1.clickonYes();
	 }
}
