package com.webdriver.helper.utility;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.junit.Test;

public class TestResourcePathHelper {
	
	private ResourcePathHelper helper;
	private String path;

	@Test
	public void test_getResourcePathInstance(){
		givenIhaveTheInstanceOfResourcePatHelper();
		thenInstanceShouldNotBeNull();
	}
	
	@Test
	public void test_getBaseResourcePath(){
		givenIhaveTheInstanceOfResourcePatHelper();
		whenIcallTheGetBaseResourceMethod();
		thenAbsolutePathshouldBeReturned();
	}

	private void thenAbsolutePathshouldBeReturned() {
		assertTrue(path.length() > 1, "Null Path is coming");
	}

	private void whenIcallTheGetBaseResourceMethod() {
		path = helper.getBaseResourcePath();
	}

	private void thenInstanceShouldNotBeNull() {
		assertNotNull(helper,"ResourceHelperPath object is Null");
		
	}

	private void givenIhaveTheInstanceOfResourcePatHelper() {
		helper = ResourcePathHelper.getInstance();
	}

}
