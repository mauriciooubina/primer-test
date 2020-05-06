package com.academy.crowdar.business;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.academy.crowdar.business.pages.MicrosoftHomePage;
import com.academy.crowdar.business.pages.MicrosoftResultPage;
import com.acadeny.crowdar.business.interfaces.BusinessInterface;


public class MicrosoftLogInBusiness implements BusinessInterface{
	private static final String LOG_IN_BTN = "meControl";
	private static final String LOG_IN_PLACE = "loginfmt";
	private MicrosoftHomePage homePage;
	private MicrosoftResultPage resultPage;	
	
	public MicrosoftLogInBusiness(WebDriver driver) {
		super();
		this.resultPage = new MicrosoftResultPage(driver);
		this.homePage = new MicrosoftHomePage(driver);
	}

	public void perform(String text) {
		homePage.clickButton(LOG_IN_BTN);
		homePage.completeText(text, LOG_IN_PLACE);
		
		Assert.assertEquals("Iniciar sesión en tu cuenta Microsoft", resultPage.getTitle());
	}
}
