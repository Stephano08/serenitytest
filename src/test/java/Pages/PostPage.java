package Pages;

import net.thucydides.core.annotations.Step;

public class PostPage {
	
	PostPagePOM post;
	
	@Step
	public void AccessPost()
	{
		post.accespost();
	}
	
	@Step
	public void ClickAddNewBtn()
	{
		post.addnewbtn();
	}
	
	@Step
	public void FillPostContent() {
		
		post.fillpostcontent();
	}
	
	@Step
	public void ClickPreviewBtn() {
		
		post.clickpreviewbtn();
	}
	
	@Step
	public void ClickOnDraftPost() {
		
	}
	
	@Step
	public void ClickOnPublishBtn() {
		
	}
	
	@Step
	public void ClickQuickEditPost() {
		
	}
	
	@Step
	public void FillQuickEditPostFields() {
		
	}

	@Step
	public void ClickUpdateBtn()
	{
		
	}
	
	@Step
	public void ClickEditPost(){
		
	}
	
	@Step
	public void ReplacePostContent() {
		
	}
}
