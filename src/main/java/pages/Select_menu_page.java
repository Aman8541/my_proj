package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Select_menu_page extends BaseLibrary {
	public Select_menu_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#widget\"]")
	private WebElement wedgets;
	@FindBy(xpath = "//*[text()='select menu']")
	private WebElement select_menu;
	@FindBy(xpath = "//*[@id=\"tab_24\"]/form/div/div[1]/select")
	private WebElement select_value;
	@FindBy(xpath = "//*[@id=\"tab_24\"]/form/div/div[2]/select")
	private WebElement select_one;
	@FindBy(xpath = "//*[@id=\"tab_24\"]/form/div/div[3]/div/select")
	private WebElement old_style_select_menu;
	@FindBy(xpath = "//*[@id=\"tab_24\"]/form/div/div[5]/div/select")
	private WebElement standard_multi_select;
	public void click_Wedgets() {
		wedgets.click();
	}
	public void Click_select_menu() {
		select_menu.click();
	}
	public void Click_select_value() {
		selectByVisibleText(select_value, "Group 1, Option 1");
	}
	public void Click_select_one() {
		selectByVisibleText(select_one, "CSS");
	}
	public void Click_old_style_select_menu() {
		selectByVisibleText(old_style_select_menu, "PHP");
	}
	public void Click_standard_multi_select() {
		selectByVisibleText(standard_multi_select, "javascript");
	}
	

}
