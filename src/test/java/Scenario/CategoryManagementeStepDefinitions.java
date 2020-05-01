package Scenario;

import Pages.CategoryPage;
import Pages.HomePage;
import Pages.PostPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CategoryManagementeStepDefinitions {
	
	@Steps
	HomePage home;
	
	@Steps
	PostPage post;
	
	@Steps
	CategoryPage category;

	
	@Given("User is logged on wordpress page at Category Module")
	public void user_is_logged_on_wordpress_page_at_Category_Module() {

	}

	@When("User completes the new Category fields")
	public void user_completes_the_new_Category_fields() {

	}

	@Then("User can add the category by clicking Add New Category")
	public void user_can_add_the_category_by_clicking_Add_New_Category() {

	}

	@When("User clicks on Quick Edit on a listed category")
	public void user_clicks_on_Quick_Edit_on_a_listed_category() {

	}

	@Then("User can edit some fields of the category")
	public void user_can_edit_some_fields_of_the_category() {

	}

	@Then("User can save the changes by clicking Update Category button")
	public void user_can_save_the_changes_by_clicking_Update_Category_button() {

	}


	@When("User clicks on Edit on a listed category")
	public void user_clicks_on_Edit_on_a_listed_category() {

	}

	@Then("User can edit the content of the category")
	public void user_can_edit_the_content_of_the_category() {

	}

	@Then("User can save the category changes by clicking Update button")
	public void user_can_save_the_category_changes_by_clicking_Update_button() {

	}
}
