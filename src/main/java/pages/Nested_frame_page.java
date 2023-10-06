package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Nested_frame_page extends BaseLibrary {
	public Nested_frame_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@data-target=\"#alerts\"]")
	private WebElement Alert_windows_frame;
	@FindBy(xpath = "//*[@href=\"#tab_14\"]")
	private WebElement nasted_frame;
	@FindBy(xpath = "//*[@src=\"target1.html\"]")
	private WebElement parent_frame;
	@FindBy(xpath = "//*[@src=\"text.html\"]")
	private WebElement inner_parent_frame;
	@FindBy(xpath = "//*[@src=\"example.html\"]")
	private WebElement child_frame;
	public void Click_Alert_windows_frame() {
		Alert_windows_frame.click();
	}
	public void Click_nasted_frame() {
		nasted_frame.click();
	}
	public void enter_inner_parrentframe() {
		driver.switchTo().parentFrame();//we can also use parentFrame to switch child frame to parent frame 
		driver.switchTo().frame(inner_parent_frame);
		String text=driver.findElement(By.xpath("//*[text()='Parent']")).getText();
		System.out.println("parent frame text: "+text);
	}
	public void enter_childframe() {
		driver.switchTo().frame(parent_frame);
		driver.switchTo().frame(inner_parent_frame);
		driver.switchTo().frame(child_frame);
		driver.findElement(By.xpath("//*[@href=\"text1.html\"]")).click();
		String text=driver.findElement(By.xpath("//*[text()='Hello']")).getText();
		System.out.println("child frame text: "+text);
		driver.switchTo().parentFrame();
		
	}

}
