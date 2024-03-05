package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testFile.Keyword;

public class HomePage {

	// locator using POM
	// keyword + pagemodel
	@FindBy(css = "a[href=\\\"/account/login?ret=/\\\"]")
	public WebElement loginButton;

	@FindBy(css = "input.Pke_EE")
	
	public WebElement searchBox;

	@FindBy(css = "a[href=\\\"/viewcart?exploreMode=true&preference=FLIPKART\\\"]")
	public WebElement cartButton;

	@FindBy(css = "a[title^='Become a']")
	public WebElement becomeSeller;

	// locator specific method
	public void clickLoginButton() {

		loginButton.click();

	}

	public void clickSearchBox() {

		searchBox.sendKeys("Shoes for women");
		
	}
	public String getCurrentPageTitle(String text) {

		String currTitle = Keyword.driver.getTitle();
		if(text.contains(currTitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		return currTitle;
		
	}

	public void clickCartButton() {

		cartButton.click();

	}

	public void clickBecomeSeller() {

		becomeSeller.click();

	}

}
