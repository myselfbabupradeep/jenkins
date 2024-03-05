package Org.FaceBook;

import com.fb.baseclass.BaseClass;
import com.fb.locators.FbSignupLocators;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FaceBookSignUp 
{

	public static BaseClass base = BaseClass.getInstance();
//    public static FbSignupLocators locators = FbSignupLocators.getInstance();
	FbSignupLocators locators = new FbSignupLocators();
	
	@Given("Launch Edge Browser with Url {string}")
	public void launch_edge_browser_with_url(String url) {
		    base.gotoUrl(url);		
	}

	@Given("Click Create New AccountButton")
	public void click_create_new_account_button() {
		    base.singleTap(locators.getCreatenewbutton());
	}
	
	@When("Enter First Name {string}")
	public void enter_first_name(String firstname) 
	{  
		    base.giveText(locators.getFirstname(), firstname);
	}

	@When("Enter Surname {string}")
	public void enter_surname(String lastname) {
		   base.giveText(locators.getLastname(), lastname);
	}

	@When("Enter the mail id {string}")
	public void enter_the_mail_id(String email) {
		  base.giveText(locators.getEmail(), email);
	}

	@When("Reenter the mail id {string}")
	public void reenter_the_mail_id(String reenter) {
		  base.giveText(locators.getReenteremail(), reenter);
	} 

	@When("Enter Password {string}")
	public void enter_password(String password) {
		  base.giveText(locators.getPassword(), password);
	}

	@When("Select Date of Birth {string}")
	public void select_date_of_birth(String date) {
		  base.selectByText(locators.getDd1date(), date);
	}  

	@When("Select Month of Birth {string}")
	public void select_month_of_birth(String month) {
		  base.selectByText(locators.getDd2month(), month);
	}

	@When("Select Year of Birth {string}")
	public void select_year_of_birth(String year) {
		  base.selectByText(locators.getDd3year(), year);
	}

	@When("Select Male radio button")
	public void select_male_radio_button() {
		 base.singleTap(locators.getGendermale());
	} 

	@Then("Click on Sign Up button")
	public void click_on_sign_up_button() {
		base.singleTap(locators.getSubmitbutton());
		base.waitfor3seconds();
	}

	@Then("TakeScreenshort {string}")
	public void take_screenshort(String firstname)  {
		base.screenShot(firstname);
		base.waitfor3seconds();
//		base.closeTab();	
	}
	
	
	
	@Then("Check The Broken Links In Page {string}")
	public void check_the_broken_links_in_page(String string) {
		base.brokenLink(string);
	}

}
