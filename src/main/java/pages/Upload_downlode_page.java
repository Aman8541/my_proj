package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Upload_downlode_page extends BaseLibrary {
	public Upload_downlode_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	@FindBy(xpath = "//*[@href=\"#tab_8\"]")
	private WebElement uplode_downlode;
	@FindBy(xpath = "//*[text()='Select a file']")
	private WebElement selectfile;
	public void clickElements() {
		elements.click();
	}
	public void clickuplode_downlode() {
		uplode_downlode.click();
	}
	public void clickselectfile() {
		selectfile.click();
	}
	public void UplodeFile() {
		uplodefile("C:\\Users\\amana\\Downloads\\Documents\\Aman_Kumar_CV(Automation).pdf");
	}



}
