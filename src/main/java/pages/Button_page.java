package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Button_page extends BaseLibrary {
	public Button_page() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Element;
	public void clickElement() {
		Element.click();
	}    
	@FindBy(xpath = "//*[@href=\"#tab_5\"]")
	private WebElement clickbutton;
	public void Clickbutton() {
		clickbutton.click();
	}
	@FindBy(xpath = "//*[@id=\"tab_5\"]/div[1]/button")
	private WebElement doubleclick;
	public void Doubleclick() {
		 DoubleClick(doubleclick);
	}
	@FindBy(xpath = "//*[@id=\"noContextMenu\"]")
	private WebElement rightclick;
	public void Rightclick() {
		RightClick(rightclick);
	}
	@FindBy(xpath = "//*[@id=\"tab_5\"]/div[3]/button")
	private WebElement clickme;
	public void Clickme() {
		clickme.click();
	}
	   
	

}
