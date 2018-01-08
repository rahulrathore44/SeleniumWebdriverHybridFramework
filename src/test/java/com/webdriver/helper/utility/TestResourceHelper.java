package com.webdriver.helper.utility;

import static org.testng.Assert.assertNotNull;

import org.junit.Test;

import com.webdriver.helper.utility.ResourceHelper;

public class TestResourceHelper {
	
	private ResourceHelper helper;
	private String data;

	@Test
	public void test_getTheInstanceOfResourceHelper(){
		givenIhaveTheInstaceOfResourceHelper();
		thenTheInstanceshouldNotBeNull();
	}
	
	@Test
	public void test_currentDateMethod(){
		givenIhaveTheInstaceOfResourceHelper();
		whenIcallTheGetCurrentDateMethod();
		theStringShouldbeReturned();
	}
	
	@Test
	public void test_currentDateTimeMethod(){
		givenIhaveTheInstaceOfResourceHelper();
		whenIcallTheGetCurrentDateTimeMethod();
		theStringShouldbeReturned();
	}
	
	private void thenTheInstanceshouldNotBeNull() {
		assertNotNull(helper, "ResourceHelper object is Null");
	}

	
	private void whenIcallTheGetCurrentDateMethod() {
		data = helper.getCurrentDate();
	}

	private void theStringShouldbeReturned() {
		assertNotNull(data,"Current Date is comming as Null");
	}

	private void whenIcallTheGetCurrentDateTimeMethod() {
		data = helper.getCurrentDateTime();
	}

	private void givenIhaveTheInstaceOfResourceHelper() {
		helper = ResourceHelper.getInstance();
	}

}
