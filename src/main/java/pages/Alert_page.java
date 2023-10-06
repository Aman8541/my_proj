package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Alert_page extends BaseLibrary {
	public Alert_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//*[@data-target=\"#alerts\"]" )
	private WebElement AlertFrameWindow;
	@FindBy(xpath ="//*[@href=\"#tab_12\"]" )
	private WebElement Alert;
	@FindBy(xpath ="//*[@id=\"tab_12\"]/div[1]/div[2]/button" )
	private WebElement AlertWithOk;
	@FindBy(xpath ="//*[@id=\"tab_12\"]/div[3]/div[2]/button" )
	private WebElement AlertWithOK_CANCLE;
	@FindBy(xpath ="//*[@id=\"tab_12\"]/div[2]/div[2]/button" )
	private WebElement AlertWithOK_5sec;
	@FindBy(xpath ="//*[@id=\"tab_12\"]/div[4]/div[2]/button" )
	private WebElement AlertWithINPUTBOX;
	public void Clickalertframewindow(){
		AlertFrameWindow.click();
	}
	public void Clickalert() {
		Alert.click();
	}
	public void ClickAlertWithOk(){
		AlertWithOk.click();
		//Thread.sleep(2000);
		Alert_present(5);
		driver.switchTo().alert().accept();
	}
	public void ClickAlertWithOK_5sec() {
			AlertWithOK_5sec.click();
			//Thread.sleep(7000);
			Alert_present(5);
			driver.switchTo().alert().accept();
	}
	public void ClickAlertWithOK_CANCLE() {
		AlertWithOK_CANCLE.click();
		//Thread.sleep(2000);
		Alert_present(5);
		driver.switchTo().alert().dismiss();
	}
	public void ClickAlertWithINPUTBOX() {
		AlertWithINPUTBOX.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("this is aman kumar bhagat");
		driver.switchTo().alert().accept();
	}

}
