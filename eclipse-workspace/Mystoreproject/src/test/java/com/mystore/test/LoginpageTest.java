package com.mystore.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mystore.base.Baseclass;
import com.mystore.pages.Loginpage;

public class LoginpageTest extends Baseclass {

	@BeforeTest
	public void Openbrowser() {
		browserLanuch("http://automationpractice.com/index.php");
	}

	@Test
	public void clicksignbtn() throws InterruptedException {
		Loginpage a = new Loginpage();

		btnclick(a.getSignin());
		scrollByVisibleElement(a.getScrldown());
		enterText(a.getMailId(), "maari18@gmail.com");
     	enterText(a.getPassword(), "627758");
     	btnclick(a.getSigninbtn());
		Thread.sleep(5);
		//closeallbrowser();
	}

}
