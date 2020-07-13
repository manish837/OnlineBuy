package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class AmazonPage extends TestBase {

	@FindBy(xpath = "//span[@class='nav-sprite nav-logo-base']")
	WebElement logo;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement SearchBox;
	
	@FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	WebElement Go;
	
	

	// samsung galaxy m21 mobile

	// Initializing the Page Objects:
	public AmazonPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnLogo() {
		logo.click();
	}
	
	public void searchProduct()
	{
		SearchBox.sendKeys("Readme note 9 4gp");
	}
	
	public void clickOnGoButton() {
		Go.click();
	}

}
