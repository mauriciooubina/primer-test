package com.academy.crowdar.business.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MicrosoftResultPage {
	private static final String SELECTOR_RESULT = "#rso > div:nth-child(%s) > div > div.r > a";
	private WebDriver driver;
	
	public MicrosoftResultPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void clickOnTheResult(String text) {
		WebElement result = driver.findElement(By.cssSelector(String.format(SELECTOR_RESULT, text)));
		result.click();
	}
	
	

	public Object getTitle() {
		return driver.getTitle();
	}

	public Object getUrl() {
		return driver.getCurrentUrl();
	}
	
}
