package Pages;

import net.thucydides.core.annotations.Step;

public class MainPage {
	
	MainPagePOM main;
	
	@Step
	public void verifyAdmin()
	{
		main.verifylogin();
	}

}
