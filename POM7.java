package Lab7;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM7 {
	WebDriver driver;
	java7 object;
	@BeforeTest
	public void before() {
	driver =new ChromeDriver();
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject");
	driver.manage().window().maximize();
	PropertyConfigurator.configure("log4j.properties");
	}
	@Test
	public void customer() throws Exception {
		object=new java7(driver);
		object.XYZ();
	}
	@AfterTest
	public void close() throws Exception {
		driver.close();
	}

}
