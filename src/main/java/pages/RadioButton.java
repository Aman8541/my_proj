package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baselibrary.BaseLibrary;

public class RadioButton extends BaseLibrary {
	public RadioButton() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Element;
	public void clickElement() {
		Element.click();
	}
	@FindBy(xpath = "//*[@href=\"#tab_3\"]")
	private WebElement clickradiobutton;
	public void clickRadioButton() {
		clickradiobutton.click();
	}
	@FindBy(xpath = "//*[@id=\"yes\"]")
	private WebElement yes ;
	@FindBy(xpath = "//*[@id=\"impressive\"]")
	private WebElement impressive;
	@FindBy(xpath = "//*[@id=\"no\"]")
	private WebElement no ;

	public void pressRadioButtonYes() {
		if(getdata(1,1,0).equals("true")) {
			yes.click();
			WebElement yes=driver.findElement( By.xpath("//*[@id=\"radio-content\"]"));
			String yes1=yes.getText();
			Assert.assertEquals(getdata(1,2,0), yes1);
		}
	}
	public void pressRadioButtonImpressive() {
		if(getdata(1,1,1).equals("true")) {
			impressive.click();
			WebElement imp=driver.findElement( By.xpath("//*[@id=\"radio-content\"]"));
			String imp1=imp.getText();
			Assert.assertEquals(getdata(1,2,0), imp1);
		}
	}
	public void pressRadioButtonNo() {
		if(getdata(1,1,2).equals("true")) {
			no.click();
			WebElement no=driver.findElement( By.xpath("//*[@id=\"radio-content\"]"));
			String no1=no.getText();
			Assert.assertEquals(getdata(1,2,2), no1);
		}
	}
	
	

}
