package com.webdriver.helper.utility;

public class ResourcePathHelper {

	private static ResourcePathHelper helper;
	
	public static ResourcePathHelper getInstance() {
		if(helper == null)
			helper = new ResourcePathHelper();
		return helper;
	}

	public String getBaseResourcePath() {
		return ResourceHelper.class.getClassLoader().getResource("./").getPath();
	}


}
