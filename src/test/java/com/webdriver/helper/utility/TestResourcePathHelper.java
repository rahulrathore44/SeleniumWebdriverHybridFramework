package com.webdriver.helper.utility;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.io.InputStream;

import org.junit.Test;

public class TestResourcePathHelper {
	
	private ResourcePathHelper helper;
	private String path;
	private InputStream inputStream;

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

	@Test(expected = IllegalArgumentException.class)
	public void test_getResourcePathWithInvalidStringArgument(){
		givenIhaveTheInstanceOfResourcePatHelper();
		whenIcallTheGetResourcePathWithStringArgument("resource/config");
		thenAbsolutePathshouldBeReturned();
	}
	
	@Test
	public void test_getResourcePath_with_valid_string_argument(){
		givenIhaveTheInstanceOfResourcePatHelper();
		whenIcallTheGetResourcePathWithStringArgument("config/");
		thenAbsolutePathshouldBeReturned();
	}
	
	@Test
	public void test_getResourcePath_with_valid_empty_string_argument(){
		givenIhaveTheInstanceOfResourcePatHelper();
		whenIcallTheGetResourcePathWithStringArgument("");
		thenAbsolutePathshouldBeReturned();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_getResourcePath_with_valid_null_string_argument(){
		givenIhaveTheInstanceOfResourcePatHelper();
		whenIcallTheGetResourcePathWithStringArgument(null);
		thenAbsolutePathshouldBeReturned();
	}
	
	@Test
	public void test_getResourcePathInputStream_with_valid_string_argument(){
		givenIhaveTheInstanceOfResourcePatHelper();
		whenIcallTheGetResourcePathInputStreamWithArgument("config/");
		thenInputStreamObjectshouldBeReturned();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_getResourcePathInputStream_with_invlaid_string_argument(){
		givenIhaveTheInstanceOfResourcePatHelper();
		whenIcallTheGetResourcePathInputStreamWithArgument("config/invalid");
		thenInputStreamObjectshouldBeReturned();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_getResourcePathInputStream_with_null_string_argument(){
		givenIhaveTheInstanceOfResourcePatHelper();
		whenIcallTheGetResourcePathInputStreamWithArgument(null);
		thenInputStreamObjectshouldBeReturned();
	}
	
	private void thenInputStreamObjectshouldBeReturned() {
		assertNotNull(inputStream,"GetResourcePathInputStream is returning the object as Null");
	}

	private void whenIcallTheGetResourcePathInputStreamWithArgument(String newParam) {
		inputStream = helper.getResourcePathInputStream(newParam);
	}

	private void whenIcallTheGetResourcePathWithStringArgument(String newParam) {
		path = helper.getResourcePath(newParam);
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
