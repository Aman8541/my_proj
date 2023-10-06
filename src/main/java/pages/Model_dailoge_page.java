package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Model_dailoge_page extends BaseLibrary {
	public Model_dailoge_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#alerts\"]")
	private WebElement Alert_windows_frame;
	@FindBy(xpath = "//*[@href=\"#tab_15\"]")
	private WebElement Model_dailoge;
	@FindBy(xpath = "//*[@id=\"tab_15\"]/div/button[1]")
	private WebElement small_model;
	@FindBy(xpath = "//*[@id=\"tab_15\"]/div/button[2]")
	private WebElement large_model;
	public void Click_Alert_windows_frame() {
		Alert_windows_frame.click();
	}
	public void Click_Model_dailoge() {
		Model_dailoge.click();
	}
	public void Read_Small_model() throws InterruptedException {
		small_model.click();
		Thread.sleep(3000);
		String text=driver.findElement(By.xpath("//*[@id=\"exampleModal1\"]/div/div/div[2]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//*[@id=\"exampleModal1\"]/div/div/div[3]/button")).click();
	}
	public void Read_Lage_model() throws InterruptedException {
		large_model.click();
		Thread.sleep(3000);
		String text1=driver.findElement(By.xpath("//*[@id=\"exampleModal2\"]/div/div/div[2]")).getText();
		System.out.println(text1);
		driver.findElement(By.xpath("//*[@id=\"exampleModal2\"]/div/div/div[3]/button")).click();
	}
	
}
