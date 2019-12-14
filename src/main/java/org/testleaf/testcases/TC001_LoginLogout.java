package org.testleaf.testcases;

import org.testleaf.base.ProjectSpecificMethods;
//import org.testleaf.pages.AddCart;
//import org.testleaf.pages.AmazonLogin;
//import org.testleaf.pages.MobDetails;
//import org.testleaf.pages.Proceed;
import org.testleaf.pages.SearchMobile;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName = "TC001";
	}
	
	@Test(dataProvider = "fetchData")
	public void MobileDetails(String mname) {
	
		new SearchMobile()
		.MobName(mname)
		//new MobDetails()
		.SamDetails()
		.DeliveryDate()
		
		//new AddCart()
		.IncCart()
		.Confirm()
		
		//new Proceed()
		.toBuy()
		
		//new AmazonLogin()
		.ConfirmSign()
		.Continue()
		.ErrorConfirm();
		
		
		
	}

}
