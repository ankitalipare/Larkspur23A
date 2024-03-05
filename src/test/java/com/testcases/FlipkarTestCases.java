package com.testcases;

import java.io.IOException;

import org.checkerframework.checker.lock.qual.Holding;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.TestBeforeSetup;
import com.pages.HomePage;
import com.testFile.Config;
import com.testFile.Keyword;
import com.testFile.Locator;

import utility.PropUtil;

public class FlipkarTestCases extends TestBeforeSetup {

	@Test
	public void verifyLoginButton() throws IOException {

		// here browser & url will launch in testbasesetup class
		key.clickLoginButton(Locator.LOGINBUTTON);

	}

	@Test
	public void vrifySearchBoxDisplaySpecifiedProduct() throws IOException {

		String dir = System.getProperty("user.dir");
		String filePath = dir + "/src/test/resources/Locator.properties";
		PropUtil prop = new PropUtil(filePath);

		key.enterProductYouWantToSearch(prop.getValue("SEARCHBOX"));
		// key.enterProductYouWantToSearch(Locator.SEARCHBOX);
		String actualUrl = "Shoes for women";
		String currentUrl = key.getCurrentPageUrl(actualUrl);
		System.out.println(currentUrl);
	}
	
	@Test
	// using Page object model POM
	public void verifySearchBoxDisplaySpecifiedProductUsingPOM() throws IOException {

		HomePage home = PageFactory.initElements(Keyword.driver, HomePage.class);
		home.clickSearchBox();
		String actualUrl = "Shoes for women";
		String currentUrl = home.getCurrentPageTitle(actualUrl);
		System.out.println(currentUrl);
	}

	@Test
	public void verifyCartButton() throws IOException {

		HomePage home = PageFactory.initElements(Keyword.driver, HomePage.class);
		home.clickCartButton();
		/*String dir = System.getProperty("user.dir");
		String filePath = dir + "/src/test/resources/Locator.properties";
		PropUtil prop = new PropUtil(filePath);
		key.clickCartButton(prop.getValue("CARTBUTTON"));*/

	}

	@Test
	public void verifyBecomeASellerButton() throws IOException {

		
		String dir = System.getProperty("user.dir");
		String filePath = dir + "/src/test/resources/Locator.properties";
		PropUtil prop = new PropUtil(filePath);

		key.clickBecomeASellerButton(prop.getValue("BECOMEASELLER"));
		String actTitle = "Sell Online - Start Selling Online on Flipkart Seller Hub";
		String currTitle = key.getCurrPageTitle(actTitle);
		System.out.println(currTitle);

	}
}
