package com.academy.crowdar.business;

import org.openqa.selenium.WebDriver;
import com.academy.crowdar.business.pages.MicrosoftHomePage;
import com.academy.crowdar.business.pages.MicrosoftResultPage;
import com.acadeny.crowdar.business.interfaces.BusinessInterface;
import org.junit.Assert;

public class MicrosoftSearchBusiness implements BusinessInterface{
	private static final String SEARCH_BTN = "search";
	private static final String SEARCH = "q";
	private MicrosoftHomePage homePage;
	private MicrosoftResultPage resultPage;
	
	public MicrosoftSearchBusiness(WebDriver driver) {
		super();
		this.homePage = new MicrosoftHomePage(driver);
		this.resultPage = new MicrosoftResultPage(driver);
	}

	public void perform(String text) {
		homePage.clickButton(SEARCH_BTN);
		homePage.completeText(text,SEARCH);
		homePage.clickButton(SEARCH_BTN);

		Assert.assertEquals("", resultPage.getTitle());
	}
}
