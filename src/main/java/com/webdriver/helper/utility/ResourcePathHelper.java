package com.webdriver.helper.utility;

import java.io.InputStream;

import org.apache.log4j.Logger;

public class ResourcePathHelper {

	private static ResourcePathHelper helper;
	private Logger oLog = Logger.getLogger(ResourceHelper.class);
	private String url;
	private InputStream stream;
	
	public static ResourcePathHelper getInstance() {
		if(helper == null)
			helper = new ResourcePathHelper();
		return helper;
	}

	public String getBaseResourcePath() {
		String basePath = ResourceHelper.class.getClassLoader().getResource("./").getPath();
		oLog.info(basePath);
		return basePath;
		
	}

	public String getResourcePath(String string) {
		try{
			url = ResourceHelper.class.getClassLoader().getResource(string).getPath();
		}catch(Exception e){
			throw new IllegalArgumentException(string);
		}
		return url;
	}

	public InputStream getResourcePathInputStream(String string) {
		try {
			stream = ResourceHelper.class.getClassLoader().getResourceAsStream(string);
		} catch (Exception e) {
			throw new IllegalArgumentException(string);
		}
		
		if(stream == null)
			throw new IllegalArgumentException(string);
		return stream;
	}



}
