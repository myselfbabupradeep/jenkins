package com.fb.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.fb.baseclass.BaseClass;

public class FbSignupLocators  {
	
	
	
//	public static FbSignupLocators locators = null;
//	
//	public static FbSignupLocators getInstance()
//	{
//		if(locators==(null)) 
//	    {
//		locators = new FbSignupLocators();
//	    }
//	return locators;
//	}

	public FbSignupLocators() 
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Create new')]")
	private WebElement createnewbutton;
	
	@FindBy(xpath = "//div/input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath = "//div/input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath = "//div/input[contains(@aria-label,'Mobile')]")
	private WebElement email;
	
	@FindBy(xpath = "//div/input[contains(@aria-label,'Re-enter')]")
	private WebElement reenteremail;

	@FindBy(xpath = "//div/input[@aria-label='New password']")
	private WebElement password;
	
	@FindBy(xpath = "//select[@id='day']")
	private WebElement dd1date;
	
	@FindBy(xpath = "//select[@id='month']")
	private WebElement dd2month;
	
	@FindBy(xpath = "//select[@id='year']")
	private WebElement dd3year;
	
	@FindBy(xpath = "//label[text()='Male']")
	private WebElement gendermale;
	
	@FindBy(xpath = "//button[@name='websubmit']")
	private WebElement submitbutton;

	public WebElement getCreatenewbutton() {
		return createnewbutton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getReenteremail() {
		return reenteremail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDd1date() {
		return dd1date;
	}

	public WebElement getDd2month() {
		return dd2month;
	}

	public WebElement getDd3year() {
		return dd3year;
	}

	public WebElement getGendermale() {
		return gendermale;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

}
