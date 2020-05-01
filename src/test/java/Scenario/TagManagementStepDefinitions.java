package Scenario;

import Pages.CategoryPage;
import Pages.HomePage;
import Pages.PostPage;
import Pages.TagPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TagManagementStepDefinitions {

	
	@Steps
	HomePage home;
	
	@Steps
	PostPage post;
	
	@Steps
	TagPage tag;
	
	@Given("User is logged on wordpress page at Tag Module")
	public void user_is_logged_on_wordpress_page_at_Tag_Module() {

	}

	@When("User completes the new Tag fields")
	public void user_completes_the_new_Tag_fields() {

	}

	@Then("User can add the tag by clicking Add New Tag")
	public void user_can_add_the_tag_by_clicking_Add_New_Tag() {

	}


	@When("User clicks on Quick Edit on a listed tag")
	public void user_clicks_on_Quick_Edit_on_a_listed_tag() {

	}

	@Then("User can edit some fields of the tag")
	public void user_can_edit_some_fields_of_the_tag() {

	}

	@Then("User can save the changes by clicking Update Tag button")
	public void user_can_save_the_changes_by_clicking_Update_Tag_button() {

	}


	@When("User clicks on Edit on a listed tag")
	public void user_clicks_on_Edit_on_a_listed_tag() {

	}

	@Then("User can edit the content of the tag")
	public void user_can_edit_the_content_of_the_tag() {

	}

	@Then("User can save the tag changes by clicking Update button")
	public void user_can_save_the_tag_changes_by_clicking_Update_button() {

	}
}
