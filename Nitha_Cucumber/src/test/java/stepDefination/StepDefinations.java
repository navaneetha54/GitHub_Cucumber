package stepDefination;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	WebDriver driver;
	@Given("Launch url{string} in a browser")
	public void launch_url_in_a_browser(String url) {
		driver=FunctionLibrary.startBrowser(url);
	    
	}

	@When("enter user name  with {string} and {string} and {string}")
	public void enter_user_name_with_and_and(String Ltype, String Lvalue, String Testdata) {
	    FunctionLibrary.typeAction(Ltype, Lvalue, Testdata);
	}

	@When("enter password with {string} and {string} and {string}")
	public void enter_password_with_and_and(String Ltype, String Lvalue, String Testdata) {
	    FunctionLibrary.typeAction(Ltype, Lvalue, Testdata);
	}

	@When("click login button with {string} and {string}")
	public void click_login_button_with_and(String Ltype, String Lvalue) {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@Then("validate title with {string}")
	public void validate_title_with(String Exp_Title) {
	    FunctionLibrary.validateTitle(Exp_Title);
	}

	@When("click suppliers link with {string} and {string}")
	public void click_suppliers_link_with_and(String Ltype, String Lvalue) {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("click add icon with {string} and {string}")
	public void click_add_icon_with_and(String Ltype, String Lvalue) {
		FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("capture a supplier number with {string} and {string}")
	public void capture_a_supplier_number_with_and(String Ltype, String Lvalue) {
	   FunctionLibrary.capturesupnum(Ltype, Lvalue);
	}

	@When("enter in {string} with {string} and {string}")
	public void enter_in_with_and(String Testdata, String Ltype, String Lvalue) {
		FunctionLibrary.typeAction(Ltype, Lvalue, Testdata);
	  
	}

	@When("click add button with {string} and {string}")
	public void click_add_button_with_and(String Ltype, String Lvalue) throws Throwable {
	   FunctionLibrary.clickAction(Ltype, Lvalue);
	   Thread.sleep(3000);
	}

	@When("click confirm ok with {string} and {string}")
	public void click_confirm_ok_with_and(String Ltype, String Lvalue) throws Throwable {
	   FunctionLibrary.clickAction(Ltype, Lvalue);
	   Thread.sleep(3000);
	}

	@When("click alert ok with {string} and {string}")
	public void click_alert_ok_with_and(String Ltype, String Lvalue) throws Throwable {
	   FunctionLibrary.clickAction(Ltype, Lvalue);
	   Thread.sleep(3000);
	}

	@Then("validate supplier table")
	public void validate_supplier_table() throws Throwable {
		FunctionLibrary.supplierTable();
	}
		@When("close browser")
		public void close_browser() {
		    driver.quit();
		
	   
	}



}
