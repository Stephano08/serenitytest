package Pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	HomePagePOM home;
	
	@Step
	public void openApplication()
	{
		home.open();
	}
	
	@Step
	public void enterUsername()
	{
		home.enterusername();
	}
	
	@Step
	public void enterPassword()
	{
		home.enterpassword();
	}
	
	@Step
	public void clickOnLoginButton()
	{
		home.clickLogin();
	}


}
