package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.RadioButton;
import pages.TextBox_page;

public class RadioButton_Test extends BaseLibrary {
	RadioButton obj1;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void launchurl(String env,String browsername) {
		launchURL(getdata(env) ,browsername);
		obj1=new RadioButton();
	}
	@Test(priority = 1)
	public void click_element() {
		obj1.clickElement();
		
	}
	@Test(priority = 2)
	public void clickradiobutton() {
		obj1.clickRadioButton();
	}
	@Test(priority = 3)
	public void pressRadioButtonYes() {
		obj1.pressRadioButtonYes();
	}
	@Test(priority = 4)
	public void pressRadioButtonImpressive() {
		obj1.pressRadioButtonImpressive();
	}
	@Test(priority = 5)
	public void pressRadioButtonNo() {
		obj1.pressRadioButtonNo();
	}
	

}
