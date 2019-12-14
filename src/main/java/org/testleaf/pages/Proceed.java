package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class Proceed extends ProjectSpecificMethods {
	
	public AmazonLogin toBuy() {
		driver.findElementByXPath("(//a[@class='a-button-text a-text-center'])").click();
		return new AmazonLogin();
	}

	
}
