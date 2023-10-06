package cliniDashboard;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import objectRepository.AddDoctor;
import objectRepository.Loginpage1;
import objectRepository.ManageDoctorPage;
import objectRepositoryDemo.MobileVerificationPage;

public class ClinicManageDoctor extends BaseClass
{
		@Test(priority = 1)
		public void Managedoctor() throws InterruptedException
		{
			ManageDoctorPage mp=new ManageDoctorPage(driver);
			mp.ManageDoctor();
			mp.ManageDoctor1();
			mp.Hamurger();
			mp.crossIcon();
		}
		@Test(priority = 2)
		public void AddDoctorPage() throws Throwable
		{
			AddDoctor ad=new AddDoctor(driver);
			ad.Add_Doctor();
			ad.Doctor_Name(prop.getProperty("doctorname"));
			ad.Qualification(prop.getProperty("qualification"));
			ad.EmailAddress(prop.getProperty("Email"));
			ad.SpecialityDropdown();
			ad.SelectSpeciality(prop.getProperty("speciality"));
			ad.CLICKACTION();
			ad.GenderDropdown();
			ad.phoneNumber(prop.getProperty("PhoneNumber"));
			ad.SelectYear();
			ad.ClickYear();
			ad.LanguageDropdown();
			ad.SelectLanguageName(prop.getProperty("Language"));
			ad.ClickLanguage();
			ad.GenerateCertificate();
			ad.SubmitButton();
			ad.captureAddDoctorMessage();
		}
		
		
		 
	
}
