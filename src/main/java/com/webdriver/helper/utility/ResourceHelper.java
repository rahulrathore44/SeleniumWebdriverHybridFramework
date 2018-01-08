package com.webdriver.helper.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ResourceHelper {
	
	private static ResourceHelper helper;
	
	public static ResourceHelper getInstance(){
		if(helper == null)
			helper = new ResourceHelper();
		return helper;
	}

	public String getCurrentDate() {
		return getDate("hhMMss");
	}

	private String getDate(String newParam) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(newParam);
		Calendar calendar = Calendar.getInstance();
		return dateFormat.format(calendar.getTime());
	}

	public String getCurrentDateTime() {
		return getDate("ddmmyyyhhMMss");
	}

}
