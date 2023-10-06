package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Links_page extends BaseLibrary {
	public Links_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Element;
	@FindBy(xpath = "//*[@href=\"#tab_6\"]")
	private WebElement links;
	@FindBy(xpath = "//*[text()='Demo Page']")
	private WebElement DemoPage;
	@FindBy(xpath = "//*[text()='×']")
	private WebElement Popup;
	public void clickElement() {
		Element.click();
	}
	public void clicklink() {
		links.click();
	}
	public void clickdemopage() {
		DemoPage.click();
	}
	public void changeDemoWindow() {
		handleWindows(1);
		
	}
	public void closewindow() {
		Popup.click();
		driver.close();
	}

}
