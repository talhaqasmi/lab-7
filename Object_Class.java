package HomeTask;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Object_Class {
	
WebDriver driver;
	
	
	
	
	
	@FindBy(xpath="(//li[@id='menu-item-4761']//child::a[@class='dropdown-toggle'])[2]")
	WebElement click_laptop;
	
	@FindBy(xpath="//h2[@class='woocommerce-loop-product__title']")
	WebElement Names;
	
	@FindBy(xpath="(//i[@class='ec ec-menu'])[2]")
	WebElement products;
	
	@FindBy(xpath="//select[@name='ppp']")
	WebElement select1;
	
	@FindBy(xpath="//span[@class='woocommerce-Price-currencySymbol']")
	WebElement price;
	
	@FindBy(xpath="//div[@class='product-thumbnail product-item__thumbnail']")
	WebElement picture;
	
	    public Object_Class(WebDriver d){
		this.driver=d;
		PageFactory.initElements(d,this);
	}
	   
	   
	  public void clicklaptop() throws InterruptedException, IOException {
		   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		   wait.until(ExpectedConditions.visibilityOf(click_laptop));
		
		   Actions act=new Actions(driver);
		   act.moveToElement(click_laptop).click().perform();
		   wait.until(ExpectedConditions.visibilityOf(select1));
		   Select sel=new Select(select1);
		   sel.selectByVisibleText("Show All");
		  Thread.sleep(10000);
		  
		   ArrayList<String> Tnames=new ArrayList<String>(); 
		   List<WebElement> Tabletnames=driver.findElements(By.xpath("//h2[@class='woocommerce-loop-product__title']"));
		   for(WebElement e:Tabletnames) {
			   String names=e.getText();
			   Tnames.add(names);
			 
			  
		   }
		   
//		   ArrayList<String> Price=new ArrayList<String>(); 
//		   List<WebElement> Prices=driver.findElements(By.xpath("//span[@class='price']"));
//		   for(WebElement e:Prices) {
//			   String price1=e.getText();
//			   Price.add(price1);
//			   
//		   }
//	   
//		   
//		   ArrayList<String> description=new ArrayList<String>(); 
//		   List<WebElement> descriptions=driver.findElements(By.xpath("//div[@class='product-short-description']"));
//		   for(WebElement e:descriptions) {
//			   String d1=e.getText();
//			   description.add(d1);
//			  
//			  
//		   }
//		   
//		  
//		   
//	   
//		   
//		   XSSFWorkbook workbook1=new XSSFWorkbook();
//			XSSFSheet sheet1=workbook1.createSheet("asadraza");
//			sheet1.createRow(0);
//			sheet1.getRow(0).createCell(0).setCellValue("Names");
//			sheet1.getRow(0).createCell(1).setCellValue("Price");
//			sheet1.getRow(0).createCell(2).setCellValue("Description");
//			
//			for(int i=1;i<Tnames.size();i++) {
//				DataFormatter df=new DataFormatter();
//				sheet1.createRow(i);
//				sheet1.getRow(i).createCell(0).setCellValue(Tnames.get(i));
//				
//			}
//			
//			for(int i=1;i<Price.size();i=i+2) {
//				DataFormatter df=new DataFormatter();
//				
//				
//				sheet1.getRow(i).createCell(1).setCellValue(Price.get(i));
//				
//			}
//			
//			for(int i=1;i<description.size();i=i+2) {
//				DataFormatter df=new DataFormatter();
//				
//				
//				sheet1.getRow(i).createCell(2).setCellValue(description.get(i));
//			}
			 List<WebElement> image=driver.findElements(By.xpath("//div[@class='product-thumbnail product-item__thumbnail']")); 
			int count=1;
			for(WebElement e:image) {
				String src1=(e.getAttribute("srcset"));
				
				URL imageURL=new URL(src1);
				BufferedImage saveimage=ImageIO.read(imageURL);
				ImageIO.write(saveimage, "jpg", new File("count"+".jpg"));
				count++;
			}
			
//			File fil=new File("C:\\Users\\Hassan\\eclipse-workspace\\Assignment_4\\HomeExcelfiles\\home.xlsx");
//			FileOutputStream fos=new FileOutputStream(fil);
//			workbook1.write(fos);
//	
//	  }	
	  
	  }

}
