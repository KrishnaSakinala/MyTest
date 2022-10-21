package pages;

import com.microsoft.playwright.Page;
import org.testng.Assert;

public class LoginPage {
	
	Page page;
	
	  public LoginPage(Page page) { 
		  this.page = page;
     }
	 

	public void login(String username,String password) {
	      page.fill("[data-test=\"username\"]", username);
	      page.fill("[data-test=\"password\"]", password);
	      page.click("[data-test=\"login-button\"]");
	}
	
	public void loginFailed() {
		boolean visible = page.isVisible("//h3[text()='Epic sadface: Sorry, this user has been locked out.']");
		Assert.assertTrue(visible);
	}
	
}
