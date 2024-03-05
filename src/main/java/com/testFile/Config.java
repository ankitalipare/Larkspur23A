package com.testFile;

import java.io.IOException;

import utility.PropUtil;

public class Config {

	public String getBrowserName()   {
		String dir = System.getProperty("user.dir");
		PropUtil p = new PropUtil(dir+"/src/main/resources/Config.properties");
		String browserName=null;
		try {
			browserName = p.getValue("BROWSERNAME");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return browserName;
	}
	public String getUrl() {

		String dir = System.getProperty("user.dir");
		PropUtil p = new PropUtil(dir+ "/src/main/resources/Config.properties");
		String url=null;
		try {
			url = p.getValue("APPURL");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return url;
	}
	
	
	
}
