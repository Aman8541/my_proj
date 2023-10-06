package tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Button_page;

public class Button_test extends BaseLibrary {
	Button_page obj;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void launchurl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new Button_page();
	}
	@Test(priority = 0)
	public void click_element() {
		obj.clickElement();
		screenshorts("passed", "elements");
	}
	@Test(priority = 1)
	public void clickbutton() {
		obj.Clickbutton();
	}
	@Test(priority = 2)
	public void clickme() {
		obj.Clickme();
	}
	@Test(priority = 3)
	public void doubleclick() {
		obj.Doubleclick();
	}
	@Test(priority = 4)
	public void rightclick() {
		obj.Rightclick();
		
	}
	
	

}
