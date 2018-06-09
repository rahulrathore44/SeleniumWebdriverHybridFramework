package com.webdriver.helper.browser.chrome;

import static org.testng.Assert.assertNotNull;

import org.junit.Test;
import org.mockito.Mockito;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCustomChromeDriverClass {
	
	private CustomChromeDriver customDriver;
	private ChromeDriver driver;
	private ChromeDriver chromeDriver;

	@Test
	public void test_I_should_get_the_chromebrowser_instance(){
		givenIcreateTheInstanceOfChromeBrowser();
		whenIcallTheGetBrowerMethod();
		thenTheInstanceOfChromeDriverShouldBeReturned();
	}

	private void whenIcallTheGetBrowerMethod() {
		driver = customDriver.getDriver();
	}

	private void thenTheInstanceOfChromeDriverShouldBeReturned() {
		assertNotNull(driver, "Chrome Driver Object is comming Null");
	}

	private void givenIcreateTheInstanceOfChromeBrowser() {
		customDriver = new CustomChromeDriver();
		/*chromeDriver = Mockito.mock(ChromeDriver.class); 
		Mockito.when(customDriver.getDriver()).thenReturn(chromeDriver);*/
	}
	

}
