package com.mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.Baseclass;

public class Loginpage extends Baseclass {

	public Loginpage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;

	@FindBy(id = "login_form")
	private WebElement scrldown;
	
	@FindBy(id = "email")
	private WebElement mailId;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(xpath = "//button[@name='SubmitLogin']")
	private WebElement signinbtn;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getScrldown() {
		return scrldown;
	}

	public WebElement getMailId() {
		return mailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSigninbtn() {
		return signinbtn;
	}
	
	

}
