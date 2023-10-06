package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Frame_page extends BaseLibrary {
	public Frame_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#alerts\"]")
	private WebElement Alert_windows_frame;
	@FindBy(xpath = "//*[@href=\"#tab_13\"]")
	private WebElement frame;
	@FindBy(xpath = "//*[@id=\"tab_13\"]/iframe[1]")
	private WebElement child_frame1;
	@FindBy(xpath = "//*[@id=\"tab_13\"]/iframe[2]")
	private WebElement child_frame2;
	public void click_Alert_windows_frame() {
		Alert_windows_frame.click();
	}
	public void click_frame() {
		frame.click();
	}
	public void read_parentframe_text() {
		String text=driver.findElement(By.xpath("//*[@id=\"tab_13\"]/p")).getText();
		System.out.println("parent frame text: "+ text);
	}
	public void read_childframe1_text() {
		driver.switchTo().frame(child_frame1);
		String text=driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println("read_childframe1_text: "+text);
		driver.switchTo().defaultContent();
	}
	public void read_childframe2_text() {
		driver.switchTo().frame(child_frame2);
		String text=driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println("read_childframe2_text: "+text);
		driver.switchTo().defaultContent();
	}

}
