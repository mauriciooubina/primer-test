package com.academy.crowdar.business;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.academy.crowdar.business.pages.MicrosoftHomePage;
import com.academy.crowdar.business.pages.MicrosoftResultPage;
import com.acadeny.crowdar.business.interfaces.BusinessInterface;


public class MicrosoftLogInBusiness implements BusinessInterface{
	private static final String logInBtn = "meControl";
	private static final String logInPlace = "loginfmt";
	private MicrosoftHomePage homePage;
	private MicrosoftResultPage resultPage;	
	
	public MicrosoftLogInBusiness(WebDriver driver) {
		super();
		this.resultPage = new MicrosoftResultPage(driver);
		this.homePage = new MicrosoftHomePage(driver);
	}

	public void perform(String text) {
		homePage.clickButton(logInBtn);
		homePage.completeText(text, logInPlace);
		
		Assert.assertEquals("Iniciar sesi�n en tu cuenta Microsoft", resultPage.getTitle());
	}
}
