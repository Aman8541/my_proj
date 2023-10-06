package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.TextBox_page;

public class TextBox_test extends BaseLibrary 
{
	TextBox_page obj;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void launchurl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new TextBox_page(); 
	}
	@Test(priority = 1)
	public void click_element() {
		obj.clickelement();
	}
	@Test(priority = 2)
	public void click_textbox() {
		obj.clickTextbox();
	}
	@Test(priority = 3)
	public void fill_details() {
		obj.Fill_data();
	}
	@Test(priority = 4)
	public void checkdetails() {
		obj.checkdetails();
	}
	

	

}
