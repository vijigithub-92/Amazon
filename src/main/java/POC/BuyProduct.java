package POC;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BuyProduct {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("http://amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30");
	driver.findElementByClassName("nav-input").click();
	WebElement price = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]");
	System.out.println(price);
	driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
	Set<String> Window = driver.getWindowHandles();
	List<String> list = new ArrayList(Window);
	driver.switchTo().window(list.get(1));//1-> child window(newly), 0 parent window
	//driver.findElementById("ddmDeliveryMessage");
	WebElement date = driver.findElementByXPath("(//span[@class='a-text-bold'])[4]");
	String str = date.getText();
	System.out.println(str);
	
	driver.findElementByXPath("(//span[@id='submit.add-to-cart'])[1]").click();
	
	WebElement displayed = driver.findElementByXPath("(//h1[@class='a-size-medium a-text-bold'])");
	String text = displayed.getText();
	String text1 = "Added to Cart";
	if(text.equals(text1))
	{
		System.out.println("Yes, its added to cart");
	}
	//displayed.equals("Added to Cart");
	driver.findElementByXPath("(//a[@class='a-button-text a-text-center'])").click();
	String title = driver.getTitle();
	String title1 = "Amazon Sign In";
	if(title.equals(title1))
	{
		System.out.println("Yes, its Amazon login page");
	}
	driver.findElementById("ap_email").clear();
	driver.findElementByClassName("a-button-input").click();
	boolean displayed2 = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").isDisplayed();
	System.out.println(displayed2);
	
	
	
	
	
	
	}

}
