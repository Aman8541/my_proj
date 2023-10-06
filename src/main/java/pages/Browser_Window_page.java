package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Browser_Window_page extends BaseLibrary {
	public Browser_Window_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#alerts\"]")
	private WebElement Alert_windows_frame;
	@FindBy(xpath = "//*[@href=\"#tab_11\"]")
	private WebElement browser_window;
	@FindBy(xpath = "//*[@id=\"tab_11\"]/div[1]/a")
	private WebElement newtab ;
	@FindBy(xpath = "//*[@id=\"tab_11\"]/div[2]/a")
	private WebElement newwindow;
	@FindBy(xpath = "//*[@id=\"tab_11\"]/div[3]/a")
	private WebElement newwindowm_message ;
	public void click_Alert_windows_frame() {
		Alert_windows_frame.click();
	}
	public void click_browser_window() {
		browser_window.click();
	}
	public void open_new_tab() {
		newtab.click();
		handleWindows(1);
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.close();
	    
	}
	public void open_new_window() {
		handleWindows(0);
		newwindow.click();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		handleWindows(1);
		driver.manage().window().maximize();
	    driver.close();
	}
	public void new_windows_message() {
		handleWindows(0);
		newwindowm_message.click();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		handleWindows(1);//problem in application
		String text=driver.findElement(By.xpath("/html/body/p")).getText();//not able to read text.
		System.out.println("test: "+text);
		driver.close();
	}
	

}
