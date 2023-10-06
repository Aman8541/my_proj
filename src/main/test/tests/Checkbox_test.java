package tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import baselibrary.BaseLibrary;
import pages.CheckBox_page;

public class Checkbox_test extends BaseLibrary{
	CheckBox_page obj;
	@Parameters({"env","browsername"})
	@BeforeTest
	public void geturl(String env,String browsername) {
		launchURL(getdata(env),browsername);
		obj=new CheckBox_page(); 
	}
	@Test(priority = 0)
	public void clickelement() {
	obj.clickelement();	
	}
	@Test(priority = 1)
	public void clickcheckbox() {
	obj.clickcheckbox();	
	}
	@Test(priority = 2)
	public void clickmobile() {
	obj.clickmobile();	
	}
	

}
