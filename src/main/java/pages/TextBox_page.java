package pages;


import java.util.List;

import javax.xml.xpath.XPath;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;


public class TextBox_page extends BaseLibrary 
{
     public TextBox_page() {
    	 PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@data-target=\"#elements\"]")
	private WebElement element;
	public void clickelement() {
		element.click();
	}
	@FindBy(xpath="//*[@href=\"#tab_1\"]")
	private WebElement textbox;
	public void clickTextbox() {
		textbox.click();
	}
	@FindBy(xpath="//*[@id=\"fullname1\"]")
	private WebElement fullname ;
	@FindBy(xpath="//*[@id=\"fullemail1\"]")
	private WebElement email;
	@FindBy(xpath="//*[@id=\"fulladdresh1\"]")
	private WebElement Currentaddress;
	@FindBy(xpath="//*[@id=\"paddresh1\"]")
	private WebElement Permanentaddress;
	@FindBy(xpath="//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
	private WebElement submit;
	public void Fill_data() {
		fullname.sendKeys(getdata(0, 0, 1));
		email.sendKeys(getdata(0, 1, 1));
		Currentaddress.sendKeys(getdata(0, 2, 1));
		Permanentaddress.sendKeys(getdata(0, 3, 1));
		submit.click();
		
	}
	public void checkdetails() {
	List<WebElement> ex=driver.findElements(By.xpath("//*[@class=\"col-md-6 mt-5\"]/label"));
	SoftAssert sf=new SoftAssert();
	int k=0;
	for(int i=1;i<ex.size();i=i+2) {
		String ExpectedValue=ex.get(i).getText();
		//Assert.assertEquals("vijay",ExpectedValue ); // hard assert:text will be terminated if actual expected not match. 
		//Assert.assertEquals(getdata(0, k, 1),ExpectedValue);
		//sf.assertEquals("vijay",ExpectedValue ); if actual and accepted result not match than other statement is also executed.
		sf.assertEquals(getdata(0, k, 1), ExpectedValue);
	    k++;
		//System.out.println(ExpectedValue);
	}
	sf.assertAll();
	}
	
	

}
