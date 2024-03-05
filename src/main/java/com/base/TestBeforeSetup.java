package com.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import com.testFile.Config;
import com.testFile.Keyword;

public class TestBeforeSetup {

	public final Keyword key = new Keyword();

	@BeforeMethod
	public void setup()  {

		Config con = new Config();
		key.launchBrowser(con.getBrowserName());
		key.launchUrl(con.getUrl());
		
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		
		key.quitBrowser();

	}
}
