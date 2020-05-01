package Scenario;

import Pages.HomePage;
import Pages.MainPage;
import Pages.PostPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PostManagementeStepDefinitions {
	
	@Steps
	HomePage home;
	
	@Steps
	MainPage main;
	
	@Steps
	PostPage post;
	
	
	@Given("User is logged on wordpress page at Post module")
	public void user_is_logged_on_wordpress_page_at_Post_module() {
		home.openApplication();
		home.enterUsername();
		home.enterPassword();
		home.clickOnLoginButton();
		post.AccessPost();

	}

	@When("User clicks on Add New")
	public void user_clicks_on_Add_New() {
		post.ClickAddNewBtn();

	}

	@When("User completes the fields")
	public void user_completes_the_fields() {
		post.FillPostContent();

	}

	@Then("User can look a preview of the Post by clicking Preview button")
	public void user_can_look_a_preview_of_the_Post_by_clicking_Preview_button() {
		post.ClickPreviewBtn();
	}


	@When("User clicks on draft post")
	public void user_clicks_on_draft_post() {

	}

	@Then("User can publish the Post by clicking Publish button")
	public void user_can_publish_the_Post_by_clicking_Publish_button() {

	}


	@When("User clicks on Quick Edit on a listed post")
	public void user_clicks_on_Quick_Edit_on_a_listed_post() {

	}

	@Then("User can edit some fields of the post")
	public void user_can_edit_some_fields_of_the_post() {

	}

	@Then("User can save the post changes by clicking Update button")
	public void user_can_save_the_post_changes_by_clicking_Update_button() {

	}


	@When("User clicks on Edit on a listed post")
	public void user_clicks_on_Edit_on_a_listed_post() {

	}

	@Then("User can edit the content of the post")
	public void user_can_edit_the_content_of_the_post() {
		
	}

	@Then("User can publish the post changes by clicking Publish button")
	public void user_can_publish_the_post_changes_by_clicking_Publish_button() {

	}
}
