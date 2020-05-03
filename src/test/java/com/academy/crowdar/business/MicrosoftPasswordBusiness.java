package com.academy.crowdar.business;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.academy.crowdar.business.pages.MicrosoftHomePage;
import com.academy.crowdar.business.pages.MicrosoftResultPage;
import com.acadeny.crowdar.business.interfaces.BusinessInterface;

public class MicrosoftPasswordBusiness implements BusinessInterface{
	private static final String continueBtn = "idSIButton9";
	private static final String passwordPlace = "passwd";
	private MicrosoftHomePage homePage;
	private MicrosoftResultPage resultPage;	
	
	public MicrosoftPasswordBusiness(WebDriver driver) {
		super();
		this.resultPage = new MicrosoftResultPage(driver);
		this.homePage = new MicrosoftHomePage(driver);
	}

	public void perform(String text) {
		homePage.clickButton(continueBtn);
		homePage.completeText(text, passwordPlace);
		
		Assert.assertEquals("Iniciar sesión en tu cuenta Microsoft", resultPage.getTitle());
	}

}
