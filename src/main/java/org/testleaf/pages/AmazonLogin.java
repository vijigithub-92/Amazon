package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class AmazonLogin extends ProjectSpecificMethods {
	
	public AmazonLogin ConfirmSign() {
		String title = driver.getTitle();
		String title1 = "Amazon Sign In";
		if(title.equals(title1))
		{
			System.out.println("Yes, its Amazon login page");
		}
		return this;
	}
	
	public AmazonLogin Continue(){
		driver.findElementByClassName("a-button-input").click();
		return this;
	}
	
	public AmazonLogin ErrorConfirm() {
		boolean displayed2 = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").isDisplayed();
		System.out.println(displayed2);
		return this;
	}
	

}
