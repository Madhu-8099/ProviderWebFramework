package checkingScripts;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.Loginpage1;

public class ClinicLoginToast extends BaseClass
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
}
}