package Lab7;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class java7 {
	WebDriver driver;
	Logger logger=Logger.getLogger("New");
	
	@FindBy(xpath="//button[text()='Bank Manager Login']")
	WebElement BankManagerLogin;
	
	
	@FindBy(xpath="//button[@ng-class='btnClass1']")
	WebElement addCustomer;
	
	@FindBy(xpath="//*[@ng-model='fName']")
	WebElement firstname;
	
	@FindBy(xpath="//*[@ng-model='lName']")
	WebElement lastname;
	
	@FindBy(xpath="//*[@ng-model='postCd']")
	WebElement postAddres;
	
	
	@FindBy(xpath="	//button[text()='Add Customer']")
	WebElement addcustomerButton;

	@FindBy(xpath="//button[text()='Home']")
	WebElement HomeButton;
	
	@FindBy(xpath="//button[text()='Customer Login']")
	WebElement CustomerLogin;
	

	
java7  (WebDriver driver){
this.driver = driver;
PageFactory.initElements(driver,this);
}
public void XYZ() throws Exception {
	Thread.sleep(3000);
	BankManagerLogin.click();
	Thread.sleep(3000);
	addCustomer.click();
	Thread.sleep(3000);
	firstname.sendKeys("talha");
	Thread.sleep(2000);
	lastname.sendKeys("qasmi");
	Thread.sleep(2000);
	postAddres.sendKeys("123");
	Thread.sleep(2000);
	addcustomerButton.click();
	logger.info("add customer button clicked");
	Alert myalert=driver.switchTo().alert();
	Thread.sleep(2000);
    myalert.accept();
    logger.info("alert handled successfully");
    Thread.sleep(2000);
    HomeButton.click();
    Thread.sleep(4000);
    CustomerLogin.click();
    
}


}
