package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;

public class WebTable extends BaseLibrary {
		public WebTable() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"tab_4\"]/div/iframe")
	private WebElement wrbtableiframe;
	
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Element;
	public void clickElement() {
		Element.click();
	}
	@FindBy(xpath = "//*[text()='web tables']")
	private WebElement webtable;
	public void clickwbTable() {
	Elementtobeclickable(webtable, 5);
	webtable.click();	
	}
	@FindBy(xpath = "/html/body/div/form/div[1]/input")
	private WebElement name;
	@FindBy(xpath = "/html/body/div/form/div[2]/input")
	private WebElement email;
	@FindBy(xpath = "//*[@class=\"btn btn-success save-btn\"]")
	private WebElement send;
	public void fillDataONWebtable() {
		driver.switchTo().frame(wrbtableiframe);
		for(int i=1;i<10;i++) {
			name.sendKeys(getdata(2,0,i));
			email.sendKeys(getdata(2,1,i));
			send.click();
		}
	}
	
	public void verifyWebtableData() {
		List<WebElement>ex=driver.findElements(By.xpath("//*[@class=\"table table-bordered data-table\"]/thead/following::tr/td[1]"));
		SoftAssert sf=new SoftAssert();
		int k=1;
		for(int i=0;i<ex.size();i++) {
			String Expected=ex.get(i).getText();
			System.out.println(Expected);
			sf.assertEquals(getdata(2,0,k), Expected);
			k++;
		}
		sf.assertAll();
		List<WebElement> ex1=driver.findElements(By.xpath("//*[@class=\"table table-bordered data-table\"]/thead/following::tr/td[2]"));
		int l=1;
		for(int i=0;i<ex1.size();i++) {
			String Expected=ex1.get(i).getText();
			System.out.println(Expected);
			sf.assertEquals(getdata(2,1,l), Expected);
			l++;
		}
		sf.assertAll();
	}
	@FindBy(xpath = "//*[text()='Edit']")
	private List<WebElement>edit;
	@FindBy(xpath = "//*[@name=\"edit_name\"]")
	private WebElement Editname;
	@FindBy(xpath = "//*[@name=\"edit_email\"]")
	private WebElement Editemail;
	@FindBy(xpath = "//*[text()='Update']")
	private WebElement update;
	public void updatewebtable() {
		//List<WebElement>edit=driver.findElements(By.xpath("//*[@class=\"table table-bordered data-table\"]/thead/following::tr/td[3]/button[1]"));
		//List<WebElement>delete=driver.findElements(By.xpath("//*[@class=\"table table-bordered data-table\"]/thead/following::td/input[1]"));
		int a=1;
		for(WebElement up:edit) {
			up.click();
			Editname.clear();
			Editname.sendKeys(getdata(2,2,a));
			Editemail.clear();
			Editemail.sendKeys(getdata(2,3,a));
			update.click();
			a++;
		}
	   
	}
	


}
