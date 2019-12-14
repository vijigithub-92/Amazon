package org.testleaf.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.base.ProjectSpecificMethods;

public class AddCart extends ProjectSpecificMethods{
	
	
	public AddCart IncCart() {
		driver.findElementByXPath("(//span[@id='submit.add-to-cart'])[1]").click();
		return this;
	}
	
	public Proceed Confirm() {
		WebElement displayed = driver.findElementByXPath("(//h1[@class='a-size-medium a-text-bold'])");
		String text = displayed.getText();
		String text1 = "Added to Cart";
		if(text.equals(text1))
		{
			System.out.println("Yes, its added to cart");
		}
		return new Proceed();
	}

}
