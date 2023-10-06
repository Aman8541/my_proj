 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Tabs_page extends BaseLibrary{
	public Tabs_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#widget\"]")
	private WebElement wedgets;
	@FindBy(xpath = "//*[@href=\"#tab_21\"]")
	private WebElement tabs;
	@FindBy(xpath = "//*[@id=\"home-tab\"]")
	private WebElement tab1;
	@FindBy(xpath = "//*[@id=\"profile-tab\"]")
	private WebElement tab2;
	@FindBy(xpath = "//*[@id=\"contact-tab\"]")
	private WebElement tab3;
	public void clickwedgets()  
	{
		wedgets.click();
	}
	public void clicktabs() {
		tabs.click();
	}
	public void readTextFromtab1() {
		tab1.click();
		String text1=driver.findElement(By.xpath("//*[@id=\"home\"]/p")).getText();
		System.out.println(text1);
	}
	public void readTextFromtab2() {
		tab2.click();
		String text2=driver.findElement(By.xpath("//*[@id=\"profile\"]/p[1]")).getText();
		System.out.println(text2);
		String text3=driver.findElement(By.xpath("//*[@id=\"profile\"]/p[2]")).getText();
		System.out.println(text3);
	}
	public void readTextFromtab3() {
		tab3.click();
		String text4=driver.findElement(By.xpath("//*[@id=\"contact\"]/p[1]")).getText();
		System.out.println(text4);
		String text5=driver.findElement(By.xpath("//*[@id=\"contact\"]/p[2]")).getText();
		System.out.println(text5);
	}
  

}
