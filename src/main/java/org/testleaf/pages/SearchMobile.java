package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class SearchMobile extends ProjectSpecificMethods {
	
	public MobDetails MobName(String data){
		driver.findElementById("twotabsearchtextbox").sendKeys(data);
		driver.findElementByClassName("nav-input").click();
		return new MobDetails();
	}
	
		
	
}
