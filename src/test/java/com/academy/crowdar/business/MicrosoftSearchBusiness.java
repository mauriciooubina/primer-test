package com.academy.crowdar.business;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.academy.crowdar.business.pages.MicrosoftHomePage;
import com.academy.crowdar.business.pages.MicrosoftResultPage;
import com.acadeny.crowdar.business.interfaces.BusinessInterface;
import org.junit.Assert;

public class MicrosoftSearchBusiness implements BusinessInterface{
	private MicrosoftHomePage homePage;
	private MicrosoftResultPage resultPage;
	
	public MicrosoftSearchBusiness(WebDriver driver) {
		super();
		this.homePage = new MicrosoftHomePage(driver);
		this.resultPage = new MicrosoftResultPage(driver);
	}

	public void perform(String text) {
		homePage.clickButton();
		homePage.completeText(text);
		homePage.clickButton();

		Assert.assertEquals("", resultPage.getTitle());
	}
}
