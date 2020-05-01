package Pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class PostPagePOM extends PageObject {
	
	public void accespost() {
		$(By.id("menu-posts")).click();
	}
	
	public void addnewbtn() {
		 $(By.xpath("//*[@id=\"wpbody-content\"]/div[5]/a")).click();
		 	 
	}
	
	public void fillpostcontent() {
		$(By.id("post-title-0")).type("Prueba1");
		$(By.xpath("//*[@id=\"editor\"]/div/div/div/div[2]/div[3]/div/div[1]/div/div/div[2]/div/div/textarea")).click();
		//$(By.id("block-fa504589-89c9-4392-8023-3461494231d4")).type("Texto de Prueba");
	}
	
	public void clickpreviewbtn() {
		$(By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/a")).click();
		//System.out.println(getDriver().getTitle());
	}
	
	public void clickdraftpost() {
		
	}

}
