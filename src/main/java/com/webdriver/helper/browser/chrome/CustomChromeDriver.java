package com.webdriver.helper.browser.chrome;

import org.openqa.selenium.chrome.ChromeDriver;

import com.webdriver.helper.utility.ResourcePathHelper;

public class CustomChromeDriver {
	
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	private ResourcePathHelper resourcePath = ResourcePathHelper.getInstance();
	
	private void setProperty(){
		System.setProperty(CHROME_DRIVER_PROPERTY, resourcePath.getResourcePath("driver/chromedriver.exe"));
	}

	public ChromeDriver getDriver() {
		setProperty();
		ChromeDriver driver = new ChromeDriver();
		return driver;
	}
	
	
	
	


}
