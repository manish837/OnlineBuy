package com.Amazon;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.AmazonPage;

public class AmazonBuyProduct extends TestBase {

	AmazonPage amazonPage;

	public AmazonBuyProduct() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();

	}

	@Test(priority = 1, enabled = true)
	public void verifyDestinationLink() {
		amazonPage.searchProduct();
		}

	
	// @AfterMethod
	// public void tearDown() {
	// driver.quit();
	// }

}
