package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Menu_page extends BaseLibrary {
	public Menu_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#widget\"]")
	private WebElement wedgets;
	@FindBy(xpath = "//*[@href=\"#tab_23\"]")
	private WebElement menu;
	@FindBy(xpath = "//*[text()='About']")
	private WebElement about;
	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[3]")
	private WebElement services;
	public void clickWedgets() {
		wedgets.click();
	}
	public void clickmenu() {
		menu.click();
	}
	public void MouseOver() {
		mouseover(about);
	}
	public void MouseOver_click() {
		mouseover_click(services,"Mobile Development" );
	}

}
