package com.academy.crowdar.business.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MicrosoftHomePage {
	private WebDriver driver;
	
	public MicrosoftHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void completeText(String text) {
		WebElement search = driver.findElement(By.name("q"));	
		search.clear();	
		search.sendKeys(text);
		search.sendKeys(Keys.TAB);
	}
	
	public void clickButton() {
		WebElement btnSearch = driver.findElement(By.cssSelector("#search"));
		btnSearch.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public String getTitle() {
		return driver.getTitle();
	}	

	public void returnWebPage() {
		driver.navigate().back();
	}

	public void clickLogInButton() {
		WebElement btnSearch = driver.findElement(By.cssSelector("#mectrl_headerPicture"));
		btnSearch.click();
	}

	public void completeLogIn(String text) {
		WebElement search = driver.findElement(By.cssSelector("#i0116"));	
		search.clear();	
		search.sendKeys(text);
		search.sendKeys(Keys.TAB);
	}

}
