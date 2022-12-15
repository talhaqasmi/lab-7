package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;

public class homeJAVA {
	WebDriver driver;
	//Logger logger=Logger.getLogger("homeJAVA");
	
	@FindBy(xpath="//a[@class='departments-menu-v2-title']")
	WebElement PRODUCTS;
	
	@FindBy(xpath="//ul[@id='menu-all-departments-1']//child::li[@id='menu-item-4761']")
	WebElement Laptops;
	
	
	@FindBy(xpath="//select[@class='electro-wc-wppp-select c-select']")
	WebElement Showdrpdown;
	
	
	@FindBy(xpath="//div[@class='woocommerce-product-details__short-description']")
	WebElement Pdes;
	
	
	
homeJAVA  (WebDriver driver){
this.driver = driver;
PageFactory.initElements(driver,this);
}
public void galaxy() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	Actions action=new Actions(driver);
	action.moveToElement(PRODUCTS).perform();
	wait.until(ExpectedConditions.elementToBeClickable(Laptops));
	Laptops.click();
	Select show=new Select(Showdrpdown);
	show.selectByVisibleText("Show All");  //getting all the laptops in a single page
	List<String> Tnames=new List<String>(); 
	
	
}
}
