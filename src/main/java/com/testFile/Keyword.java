package com.testFile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.Exception.InvalidBrowserNameError;

public class Keyword {

	public static RemoteWebDriver driver ;
	

	public void launchBrowser(String browserName) {

		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}
		else
		{
			System.err.println("Invalid browser name");
			throw new InvalidBrowserNameError(browserName);
		}
			
			
	}

	public void launchUrl(String appurl) {

		driver.get(appurl);
	}
	
	public void clickLoginButton(String loginbutton) {

		driver.findElement(By.cssSelector(loginbutton)).click();

	}

	public void enterUsername(String username,String xpath) {

		driver.findElement(By.cssSelector(xpath)).sendKeys(username);

	}

	public void enterPassword(String password, String xpath) {

		driver.findElement(By.cssSelector(xpath)).sendKeys(password);
	}

	public void enterProductYouWantToSearch(String searchbox) {

		driver.findElement(By.cssSelector(searchbox)).sendKeys("Shoes for women",Keys.ENTER);
	
	}

	public String getCurrentPageUrl(String actualUrl) {

		String curr = driver.getCurrentUrl();
		if(curr.contains(actualUrl)) {
			System.out.println("Pass");
		}
		
		return curr;
	}

	public void clickCartButton(String cartbutton) {

		driver.findElement(By.cssSelector(cartbutton)).click();
		
	}

	public void clickBecomeASellerButton(String value) {

		driver.findElement(By.cssSelector(value)).click();
		
	}
	public String getCurrPageTitle(String actVal) {

		String currTile = driver.getTitle();
		if(currTile.contains(actVal))
		{
			System.out.println("Passed");
		}
		return currTile;
		
	}
	public void closeBrowser() {

		driver.close();
	}

	public void quitBrowser() {

		driver.quit();
	}

	

}
