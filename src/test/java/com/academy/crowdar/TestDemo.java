package com.academy.crowdar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import com.academy.crowdar.business.MicrosoftLogInBusiness;
import com.academy.crowdar.business.MicrosoftSearchBusiness;

public class TestDemo {
	
	private ChromeDriver driver;
	private MicrosoftSearchBusiness microsoftSearchBusiness;
	private MicrosoftLogInBusiness microsoftLogInBusiness;	
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.microsoft.com/es-ar");	
		microsoftSearchBusiness = new MicrosoftSearchBusiness(driver);
		microsoftLogInBusiness = new MicrosoftLogInBusiness(driver);
	}
	
	@Test
	public void whenAUserSearchs() {
		String searchText = "netflix";
		microsoftSearchBusiness.perform(searchText);
	}
	
	@Test
	public void whenAUserLogsIn() {
		String searchText = "mauriciooubina@hotmail.com";
		microsoftLogInBusiness.perform(searchText);
	}
	
	
	@After
	public void finishTest() {
		driver.close();
	}

}
