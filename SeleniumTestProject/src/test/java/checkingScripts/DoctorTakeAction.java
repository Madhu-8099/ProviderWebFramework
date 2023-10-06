package checkingScripts;

import org.testng.annotations.Test;
import genericUtilities.BaseClass;
import objectRepositoryDoctorLogin.DoctorLoginPage;
import objectRepositoryDoctorLogin.Doctortakeaction;

public class DoctorTakeAction extends BaseClass
{
	
	@Test(priority = 1)
	public void Welcome() throws InterruptedException
	{
		driver.manage().window().maximize();
		DoctorLoginPage dl=new DoctorLoginPage(driver);
		dl.DoctorButton();
		dl.username(prop.getProperty("Username"));
		dl.password(prop.getProperty("Password"));
		dl.continueButton();
	}
	@Test(priority = 2)
	public void DoctorDashboardPage() throws InterruptedException
	{
		Doctortakeaction dtt=new Doctortakeaction(driver);
		dtt.Take_action1();
		dtt.Dashboard();
		dtt.Hamurger();
		dtt.crossIcon();
	}
}
