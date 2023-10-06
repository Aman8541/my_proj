package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class CheckBox_page extends BaseLibrary {
	public CheckBox_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"mylaptop\"]")
	private WebElement laptop;
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement element;
	@FindBy(xpath = "//*[@href=\"#tab_2\"]")
	private WebElement checkbox;
	@FindBy(xpath="/html/body/label")
	private WebElement mobile;
	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/iframe")
	private WebElement checkboxIframe;
	public void clickelement() {
		element.click();
	}
	public void clickcheckbox() {
		checkbox.click();
	}
	public void clickmobile() {
		driver.switchTo().frame(checkboxIframe);
		mobile.click();
		laptop.click();
		driver.switchTo().defaultContent();
	}

}
