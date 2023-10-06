package cliniDashboard;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.Loginpage1;
import objectRepository.ManageDoctorPage;
import objectRepository.ManageDoctorProfile;
import objectRepositoryDemo.MobileVerificationPage;

public class ClinicDoctorEditProfile extends BaseClass
{

	@Test(priority =1)
	public void welcome() throws InterruptedException {
		driver.manage().window().maximize();
		 Loginpage1 lp=new Loginpage1(driver);
		 lp.clickonAdmin_button();
		 lp.clickoncountry_button();
		 lp.EntercountryName(prop.getProperty("country"));
		 lp.clickonCountry();
		 lp.EnterphoneNumber(prop.getProperty("phoneNumber"));
		 lp.ContinueButton();
		 lp.CaptureToastmsg();
		 MobileVerificationPage mp=new MobileVerificationPage(driver);
		 mp.Otp_No1(prop.getProperty("Otp1"));mp.Otp_No2(prop.getProperty("Otp2"));
		 mp.Otp_No3(prop.getProperty("Otp3"));mp.Otp_No4(prop.getProperty("Otp4"));
		 mp.verify_button();
	}
	@Test(priority = 2)
	public void Managedoctor() throws InterruptedException
	{
		ManageDoctorPage mp=new ManageDoctorPage(driver);
		mp.ManageDoctor();
		mp.ManageDoctor1();
		mp.Hamurger();
		mp.crossIcon();
	}
	@Test(priority = 3)
	public void DoctorEditProfilePage() throws InterruptedException
	{
		ManageDoctorProfile md=new ManageDoctorProfile(driver);
		md.clickViewProfile();
		md.clickEditProfiledropdown();
		md.clickEditProfile1();
		//md.DoctorName(prop.getProperty("doctorname"));
		//md.Qualification(prop.getProperty("qualification"));
		//md.Clickvideoprize(prop.getProperty("vdfee"));
		md.clickaudioprize(prop.getProperty("Adfee"));
		md.clickhousecallprize(prop.getProperty("hfee"));
		md.clickgeneratecertificate();
		md.clicksubmitbutton();
		md.doctorprofileupdate();
		
	}
}
