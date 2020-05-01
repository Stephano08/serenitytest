package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;

public class HomePagePOM extends PageObject {
	
	
	public void enterusername()
	{
		$(By.id("user_login")).type("opensourcecms");
	}
	
	public void enterpassword() {
		$(By.id("user_pass")).type("opensourcecms");
			
	}
		

	public void clickLogin()
	{
		$(By.xpath("//*[@id=\"wp-submit\"]")).click();
		
	}

}
