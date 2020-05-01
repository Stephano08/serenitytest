package Scenario;

import Pages.HomePage;
import Pages.PagesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PageManagementStepDefinition {

	
	@Steps
	HomePage home;
	
	@Steps
	PagesPage page;
		
	
	@Given("User is logged on wordpress page at Page module")
	public void user_is_logged_on_wordpress_page_at_Page_module() {

	}

	@When("User clicks on Add New button")
	public void user_clicks_on_Add_New_button() {

	}

	@When("User completes the content")
	public void user_completes_the_content() {

	}

	@Then("User can look a preview of the page by clicking Preview button")
	public void user_can_look_a_preview_of_the_page_by_clicking_Preview_button() {

	}

	@When("User clicks on draft page")
	public void user_clicks_on_draft_page() {

	}

	@Then("User can publish the page by clicking Publish button")
	public void user_can_publish_the_page_by_clicking_Publish_button() {

	}


	@When("User clicks on Quick Edit on a listed page")
	public void user_clicks_on_Quick_Edit_on_a_listed_page() {

	}

	@Then("User can edit some fields of the page")
	public void user_can_edit_some_fields_of_the_page() {

	}

	@Then("User can save the page changes by clicking Update button")
	public void user_can_save_the_page_changes_by_clicking_Update_button() {

	}


	@When("User clicks on Edit on a listed page")
	public void user_clicks_on_Edit_on_a_listed_page() {

	}

	@Then("User can edit the content of the page")
	public void user_can_edit_the_content_of_the_page() {

	}

	@Then("User can publish the page changes by clicking Publish button")
	public void user_can_publish_the_page_changes_by_clicking_Publish_button() {

	}
}
