package org.testleaf.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testleaf.base.ProjectSpecificMethods;

public class MobDetails extends ProjectSpecificMethods{
	
	
	public MobDetails SamDetails() {
		WebElement price = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]");
		System.out.println(price);
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		Set<String> Window = driver.getWindowHandles();
		List<String> list = new ArrayList(Window);
		driver.switchTo().window(list.get(1));
		
		return this;
		
	}
	
	public AddCart DeliveryDate() {
		WebElement date = driver.findElementByXPath("(//span[@class='a-text-bold'])[4]");
		String str = date.getText();
		System.out.println(str);
		return new AddCart();
	}
	
	
	/*public LoginPage enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
//		HomePage hp = new HomePage();
//		return hp;
		return new HomePage();
	}
	*/
	
	

}
